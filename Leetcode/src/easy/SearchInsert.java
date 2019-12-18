package easy;

/**
 * @author : lixiang
 * @date : 2019-12-18 17:57
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 * <p>
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 * <p>
 * 输入: [1,3,5,6], 0
 * 输出: 0
 */
public class SearchInsert {
    //    第一直觉 简单粗暴 直接循环比较 当nums[i]>=target的时候 直接返回i 就是需要插入的下标；如果遍历完都没找到，那数组的最后一个下标加一就是插入的地方
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                index = i;
                break;
            }
            index = nums.length;
        }
        return index;
    }
}
