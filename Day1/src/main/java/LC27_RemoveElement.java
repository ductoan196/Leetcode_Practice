import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC27_RemoveElement {
//    public int removeElement(int[] nums, int val) {
//        int[] list = new int[nums.length];
//        int count = 0;
//        for(int num: nums){
//            if(num != val){
//                count +=1;
//                list[count-1] = num;
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = list[i];
//        }
//        return count;
//    }

    public int removeElement(int[] nums, int val) {
        int k =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
