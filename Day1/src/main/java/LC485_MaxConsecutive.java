public class LC485_MaxConsecutive {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_count = 0;
        int count = 0;
        for(int num: nums){
            if(num == 1){
                count +=1;
                max_count = Math.max(max_count,count);
            } else{
                count = 0;
            }
        }
        return max_count;
    }
}
