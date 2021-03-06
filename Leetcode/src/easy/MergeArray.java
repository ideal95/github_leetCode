package easy;

import java.util.Arrays;

/**
 * @author : lixiang
 * @date : 2019-12-18 17:06
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 */
public class MergeArray {

    /**
     * 不需要使用额外的空间
     * 从后往前读取时间复杂度O(m+n) 空间复杂度O(1)
     */

    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        nums1的下标
        int n1 = m - 1;
//        num2的下标
        int n2 = n - 1;
        int n3 = m + n - 1;
        while (n1 >= 0 && n2 >= 0) {
            nums1[n3--] = nums1[n1] > nums2[n2] ? nums1[n1--] : nums2[n2--];
        }
//        把nums2中的没有塞入nums1的数组塞入
        System.arraycopy(nums2, 0, nums1, 0, n2 + 1);
    }

    /**
     * 直接copy 然后排序
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }


}
