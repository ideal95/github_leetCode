package easy;

import java.util.TreeSet;

/**
 * @author : lixiang
 * @date : 2020-1-2 18:01
 * 414、
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3, 2, 1]
 * <p>
 * 输出: 1
 * <p>
 * 解释: 第三大的数是 1.
 * 示例 2:
 * <p>
 * 输入: [1, 2]
 * <p>
 * 输出: 2
 * <p>
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 * 示例 3:
 * <p>
 * 输入: [2, 2, 3, 1]
 * <p>
 * 输出: 1
 */
@SuppressWarnings("unused")
public class ThirdNum {

    // treeset 可以对元素对象进行排序;
//    因此 treeset中的元素是有序的 只要保留三个元素在其中就可以了
//    last()是最大的一个数 first()是最小的数
    public int c(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        if (nums == null || nums.length == 0) {
            throw new RuntimeException("error");
        }
        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) {
                set.remove(set.first());
            }
        }
        return set.size() < 3 ? set.last() : set.first();
    }
}
