import java.util.Arrays;

public class LC1051_HeightChecker {
    public static int heightChecker(int[] heights) {
        int[] newHeights = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            newHeights[i] = heights[i];
        }
        Arrays.sort(heights);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != newHeights[i]){
                count++;
            }
        }
        System.out.println(Arrays.toString(newHeights));
        return count;
    }

    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        heightChecker(heights);
    }
}
