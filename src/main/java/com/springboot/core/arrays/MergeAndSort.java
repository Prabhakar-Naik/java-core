package com.springboot.core.arrays;

import java.util.Arrays;

/**
 * @author prabhakar, @Date 10-08-2024
 */
public class MergeAndSort {

    // using ternary operator
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        // Two pointers: p1 for nums1 and p2 for nums2
        int p1 = m - 1, p2 = n - 1, p = m + n - 1;

        // While there are elements in both arrays
        while (p1 >= 0 && p2 >= 0) {
            nums1[p--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
        }

        // Copy remaining elements from nums2 if there are any
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0}, nums2 = {2, 5, 6};
        int m = 3, n = 3;
        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
        MergeAndSort mergeAndSort = new MergeAndSort();
        System.out.println(Arrays.toString(mergeAndSort.merge1(nums1, m, nums2, n)));
        System.out.println(Arrays.toString(mergeAndSort.merge2(nums1, m, nums2, n)));
    }

    // basic sort
    public int[] merge1(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        return nums1;
    }

    // normal condition
    public int[] merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        return nums1;
    }


}
