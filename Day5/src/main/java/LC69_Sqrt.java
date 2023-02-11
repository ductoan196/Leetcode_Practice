import org.example.Main;

public class LC69_Sqrt {
    public int mySqrt(int x) {
        if (x==0 || x==1)return x;
        int left =0, right = x;
        while (left<=right){
            int mid = left + (right-left)/2;

            if (x/mid ==mid){ //mid^2 = x
                return mid;
            }
            if (x/mid > mid){
                left = mid +1;
            } else {
                right = mid -1;
            }
        }
        return  right;
    }
}
