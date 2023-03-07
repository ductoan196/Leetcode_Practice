package Day01;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class LC88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            nums.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            nums.add(nums2[i]);
        }
        nums.stream().sorted();
    }
}
