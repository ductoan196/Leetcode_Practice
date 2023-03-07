package Day13_FINALTEST;

//ta sẽ sử dụng một mảng đếm tần suất xuất hiện của các phần tử trong mảng nums.
// Duyệt qua các phần tử trong mảng đếm và tính tổng của các phần tử có tần suất xuất hiện bằng 1.
//Độ phức tạp thuật toán: O(n), với n là số phần tử trong mảng nums.

public class LC1748 {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101]; // khởi tạo mảng đếm count có index là giá trị nums[i] mà theo yc: 1 <= nums[i] <= 100
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i]; // lấy giá trị phần tử ở vị trí i trong mảng nums
            count[index] += 1; // tăng số lần xuất hiện của phần tử tương ứng trong mảng đếm
        }
        for (int i = 0; i < count.length; i++) { //duyệt mảng count
            if (count[i] == 1) {
                sum += i; // tính tổng các phần tử có tần suất xuất hiện bằng 1 với i = nums[i]
            }
        }
        return sum; // trả về tổng theo yc
    }
}
