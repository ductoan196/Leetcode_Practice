import java.util.Arrays;

public class LC217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]){
                    return true;
            }
        }
        return false;
    }
}
