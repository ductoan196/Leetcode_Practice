public class LC278_FirstBadVersion {
    public int firstBadVersion(int n) {
       int left = 1;
       int right = n;
       while (left<right){
           int mid = left + (right -left)/2;
           if (guess(mid) == 0){
               return mid;
           }
           if (guess(mid) == -1){
               right = mid -1;
           }
           if (guess(mid)==1){
               left = mid +1;
           }
        }
       return left;
    }
}
