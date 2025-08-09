package com.springboot.lld.algorithms;

/**
 * @author prabhakar, @Date 06-08-2025
 */

public class MergeSort {

    /**
     * Sort an array with qmergesort algorithm.
     *
     * @param arr   array to sort
     * @low low index where to begin sort (e.g. 0)
     * @high high index where to end sort (e.g. array length - 1)
     */

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        var mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, high, mid);
    }

    public static void merge(int[] arr, int low, int high, int mid) {
        int[] temp = new int[(high - low + 1)];
        var i = low;
        var j = mid + 1;
        var k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= high){
            temp[k++] = arr[j++];
        }

        for (int m=0, n= low; m < temp.length; m++, n++) {
            arr[n] = temp[m];
        }

    }


    /**
     * Tests for {@link MergeSort#mergeSort(int[], int, int)}.
     */
//    @Test
//    void testMergeSort() {
//        var arr = new int[] {7, 13, 3, 1, 8, 5};
//        MergeSort.mergeSort(arr, 0, arr.length - 1);
//        assertEquals(6, arr.length);
//        assertEquals(1, arr[0]);
//        assertEquals(3, arr[1]);
//        assertEquals(5, arr[2]);
//        assertEquals(7, arr[3]);
//        assertEquals(8, arr[4]);
//        assertEquals(13, arr[5]);
//    }
}
