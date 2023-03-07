public class LC766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            int row = i;
            int col = 0;
            int val = matrix[row][col];
            while (row< m && col<n){
                if (matrix[row][col] != val){
                    return false;
                }
                row++;
                col++;
            }
        }
        for (int i = 0; i < n; i++) {
            int row = 0;
            int col = i;
            int val = matrix[row][col];
            while (row< m && col<n){
                if (matrix[row][col] != val){
                    return false;
                }
                row++;
                col++;
            }
        }
        return true;
    }
}
