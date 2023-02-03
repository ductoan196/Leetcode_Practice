import java.util.Arrays;

public class LC1672 {
//    public int maximumWealth(int[][] accounts) {
//        int[] wealth = new int[accounts.length];
//        for (int i = 0; i < accounts.length; i++) {
//            for (int j = 0; j < accounts[i].length; j++) {
//                wealth[i] += accounts[i][j];
//            }
//
//        }
//        Arrays.sort(wealth);
//        return wealth[wealth.length-1];
//    }
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
