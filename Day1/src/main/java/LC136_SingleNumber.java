public class LC136_SingleNumber {
    public int singleNumber(int[] nums) {

        int rs1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int rs = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    rs += 1;
                }
            }
            if (rs == 1) {
                rs1 = nums[i];
            }
        }


        return rs1;
    }

}
