package array;

import java.util.Arrays;

public class MergeSortedArray88 {



    public static void main(String[] args) {
        int[] nums1 = {1,5,9,10,0,0,0};
        int[]   nums2 = {2,6,11};
        merge(nums1, 4, nums2,3 );
        Arrays.asList(nums1)
                .stream()
                .forEach(System.out::println);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for (int i = 0; i < n; i++) {
            while(nums2[i] < nums1[index] && index < m){
                index++;
            }
            shift(nums1, index, m+i);
            nums1[index] = nums2[i];
        }

    }

    public static void shift(int[] nums1, int position, int size){
        for (int i = size; i >= position; i--) {
            nums1[position + size + 1] = nums1[position + size];
        }
    }
}
