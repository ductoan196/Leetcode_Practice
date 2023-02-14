public class LC367_PerfectSquare {

    //Kiểm tra giá trị từ 1 cho đến giá trị num/2 vì căn bậc hai của num không thể lớn hơn 1/2 của nó
    //Sử dụng nhị phân để giải quyết bài toán này
    public boolean isPerfectSquare(int num) {
        if(num ==1) return true;
//long is used as mid*mid will go above the limit of int
        long left=2;
        long right = num/2;
        while(left<=right){
            long mid =left +(right-left)/2;

            if(mid*mid == num){
                return true; //nếu bình phương mid bằng num thì trả về là true
            }
            else if(mid*mid<num){
                left= mid+1;   //nếu bình phương nhỏ hơn num thì tính nửa bên phải
            }
            else{
                right = mid-1;  //nếu bình phương mid lớn hơn num thì tính nửa bên trái
            }

        }

        return false;  //nếu chạy hết vòng mà không tìm được thì trả về false
    }
}
