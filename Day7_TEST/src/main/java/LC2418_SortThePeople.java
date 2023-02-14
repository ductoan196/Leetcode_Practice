import java.util.Arrays;
import java.util.Comparator;

public class LC2418_SortThePeople {
    //// Khởi tạo một mảng nameIndex độ dài n, giá trị từng phần tử là giá trị index của name
    //Sắp xếp thứ tự index với hàm điều kiện sử dụng comparator so sánh giá trị height có index tương ứng

    public String[] sortPeople(String[] names, int[] heights) {
            int n = names.length;
            Integer [] nameIndex = new Integer[n];
            //Sử dụng Interger vì có thể sử dụng hàm sort
            for (int i = 0; i < n; i++) {
                nameIndex[i] = i;
            }
            Arrays.sort(nameIndex, new Comparator<Integer>() {

                @Override
                public int compare(Integer i, Integer j) {
                    return heights[j] -heights[i];
                }
            });
            String[] result = new String[n]; // Khởi tạo một mảng kết quả có độ dài bằng với n
            for (int i = 0; i < n; i++) {
                result[i] = names[nameIndex[i]]; // Gán giá trị của name vào từng vị trí index tương ứng
            }
            return result;

    }
}
