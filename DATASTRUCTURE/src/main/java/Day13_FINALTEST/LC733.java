package Day13_FINALTEST;

import java.util.LinkedList;
import java.util.Queue;

//sử dụng Queue để thực hiện flood fill cho hình ảnh
//Khi ta đưa một pixel vào hàng đợi, ta đánh dấu nó bằng cách thay đổi giá trị của nó trong ma trận thành một giá trị -1
//Độ phức tạp thuật toán của hàm queue trong trường hợp này là O(n), trong đó n là số lượng pixel trong ma trận.


public class LC733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];  // Lấy màu cũ của pixel bắt đầu.
        if (oldColor == color) {
            return image; //Nếu màu cũ của pixel giống với màu mới -> trả về ma trận giữ nguyên không đổi
        }
        int[][] directions = {     //Khai báo các hướng để di chuyển
                {0, 1},
                {0, -1},
                {1, 0},
                {-1, 0}
        };
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr, sc});

        while (!queue.isEmpty()) {
            // duyệt hàng đợi, lấy ra pixel tiếp theo và kiểm tra xem có thể thay đổi màu hay không
            int[] point = queue.poll();
            int row = point[0], col = point[1];

            if (image[row][col] == oldColor) {
                //thỏa mãn đk -> thay đổi màu thành -1 và add tất cả các màu xung quanh vào queue
                image[row][col] = -1;
                for (int[] dir : directions) {
                    int newRow = row + dir[0], newCol = col + dir[1];
                    if (newRow >= 0 && newRow < image.length && newCol >= 0 && newCol < image[0].length
                            && image[newRow][newCol] == oldColor) {
                        queue.add(new int[]{newRow, newCol});
                    }
                }
            }
        }

        for (int i = 0; i < image.length; i++) {
            //Duyệt lại ma trận và thay đổi các pixel có giá trị -1 thành color
            for (int j = 0; j < image[0].length; j++) {
                if (image[i][j] == -1) {
                    image[i][j] = color;
                }
            }
        }

        return image;
    }
    }
