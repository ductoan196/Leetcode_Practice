import java.util.Arrays;

public class LC1512_NumberOfGoodPairs {

    //tìm trong mảng nums có bao nhiêu cặp số trung nhau về giá trị
    //-> sử dụng 2 vòng for để xét từng phần tử có bao nhiêu số còn lại trong dãy trùng vs nó
    //Mỗi lần trùng nhau biến đếm tăng lên 1 đơn vị -> cuối cùng trả về biến đếm

    public static int numIdenticalPairs(int[] nums) {
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] ==nums[j]){
                    count++; //mỗi lần trung nhau thì tăng lên 1 đơn vị
                }
            }
        }
        return count;
    }
}
