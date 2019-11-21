package easy;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoSum {
    /*
        暴力解决法 需要遍历每一个元素
        满足target ==num[i]+num[j]&&i!=j  即可
        时间难度为O（n2） 空间复杂度为O(1)
     */
    public int []method1(int []sums,int target){
        for (int i = 0; i <sums.length ; i++) {
            for (int j = 1; j <sums.length ; j++) {
                if(sums[i]==target-sums[j]){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /*
        hash表 一次遍历完
        有疑惑 {2，2，2，2，3} ，5 最后得到的数组下标是最后两个3，4
        但题目也并没有说是第一个出现的元素
     */
    public static int[] method2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
//            map是否含有这个key  没有就把这个Key加入到Map中
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}
