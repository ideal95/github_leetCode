package easy;

import java.util.Arrays;

/**
 * 283、给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * @author : lixiang
 * @date : 2019-11-26 9:51
 */
public class MoveZeros {

    /**
     * 1、双指针
     * nums[j]从第一位开始赋值 且num[i]不等于零就赋值
     * 全部赋值完之后 把零赋值到数组的最后
     */
    public void method(int[] nums) {
        int i = 0, j = 0;
        Arrays.sort(nums);
        for (; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }


}
