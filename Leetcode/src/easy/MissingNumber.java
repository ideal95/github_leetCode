package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : lixiang
 * @date : 2020-1-2 16:46
 * 268
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,0,1]
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/missing-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
@SuppressWarnings("unused")
public class MissingNumber {
    //思路：1、判断长度是否为1 如果是1就判断存在的元素是0还是1
//      2、排序遍历  找不到就是n缺失
    public int method(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1) {
            return nums[0] == 0 ? 1 : 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    //1、先排序
//    2、判断头尾是否符合
//    3、遍历 与上一个元素比较
    public int method2(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0) {
            return 0;
        }
        if (nums[nums.length - 1] != nums.length) {
            return nums.length;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] != 1) {
                return nums[i] - 1;
            }
        }
        return -1;
    }

    // hash表中加入 遍历 不存在的元素 就是那一个元素
    public int method3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
