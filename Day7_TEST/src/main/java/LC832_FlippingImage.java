public class LC832_FlippingImage {
    //Tạo ra một mảng mới có số hàng, cột bằng với image
    //chạy vòng for cho từng hàng ở trong mảng
    //trong mỗi hàng thực hiện đảo ngược vị trí các phần tử

        public int[][] flipAndInvertImage(int[][] image) {
            int row = image.length, col = image[0].length;
            int rs[][] = new int[row][col];
            for(int i = 0; i < row; i++)
                rs[i] = reverse(image[i]);
            return rs;
        }
        public int[] reverse(int a[]){
            int rs[] = new int[a.length]; //tạo một mảng mới hứng giá trị đảo ngược
            int n = a.length;
            for(int i = 0; i < n; i++)
                rs[i] = a[n - 1 - i] == 0 ? 1 : 0;
            //nếu tại vị trí đảo ngược mà =0 thì rs tại đó =1, còn lại thì sẽ =0
            return rs;
        }

}
