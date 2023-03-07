public class LC283 {
    public void moveZeroes(int[] nums) {
        int[] newList = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                newList[idx] = nums[i];
                idx++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = newList[i];
        }

    }
}
