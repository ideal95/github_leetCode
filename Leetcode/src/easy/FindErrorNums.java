package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : lixiang
 * @date : 2019-12-30 18:11
 * 集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重复。
 * <p>
 * 给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,2,4]
 * 输出: [2,3]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/set-mismatch
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FindErrorNums {
    //    全部遍历;
    public int[] method1(int[] nums) {
        int a = -1;
        int b = -1;
        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }
            if (count == 2) {
                a = i;
            } else if (count == 0) {
                b = i;
            }
        }
        return new int[]{a, b};
    }

    //    全部遍历  查询到了就跳出循环
    public int[] method2(int[] nums) {
        int a = -1;
        int b = -1;
        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }
            if (count == 2) {
                a = i;
            } else if (count == 0) {
                b = i;
            }
            if (a > 0 && b > 0) {
                break;
            }
        }
        return new int[]{a, b};
    }

    //排序建厂相邻两个数是否相等
    public int[] method3(int[] nums) {
        int a = -1;
        int b = 1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                a = nums[i];
            } else if (nums[i] > nums[i - 1] + 1) {
                b = nums[i - 1] + 1;
            }
        }
//        检验最后一个数 是否等N 不等则N是缺失的数 等的话就是上面赋予的值
        return new int[]{a, nums[nums.length - 1] != nums.length ? nums.length : b};
    }

    //    放入map中 如果map中找不到key 就是丢失的 ，map中有两个的 就是重复的
    public int[] method4(int[] nums) {
        int a = -1;
        int b = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    a = i;
                }
            } else {
                b = i;
            }
        }
        return new int[]{a, b};
    }

    //    新数组存储 用数组中元素作为新数组下标 遍历新数组 ==2 为重复 ==0 为缺失数字
    public int[] method5(int[] nums) {
        int a = -1;
        int b = 1;
        int[] num = new int[nums.length + 1];
        for (int value : nums) {
            num[value]++;
        }
        for (int i = 1; i < num.length; i++) {
            if (num[i] == 2) {
                a = i;
            }
            if (num[i] == 0) {
                b = i;
            }
        }
        return new int[]{a, b};
    }

    //数组全部乘-1 数组有个正数就是多余的数;
    public static int[] method6(int[] nums) {
        int a = -1;
        int b = 1;
        for (int num : nums) {
//            判断 nums[] 是否小于0
            if (nums[Math.abs(num) - 1] < 0) {
                a = Math.abs(num);
            } else {
//                大于0乘负数
                nums[Math.abs(num) - 1] *= -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                b = i + 1;
            }
        }
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 2, 2, 5};
        method6(nums);
    }
}
