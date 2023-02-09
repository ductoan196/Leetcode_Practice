public class LC50_Pow {
    public static double myPow(double x, int n) {
        int n_2 = 0;
        if (n==0){
            return 1;
        }
        if (n<0){
            n_2 = n%2 ==0? -n/2: (-n-1)/2;
        } else{
            n_2 = n%2 ==0? n/2: (n-1)/2;
        }

        double t = myPow(x, n_2);
        return n%2==0? t*t : x*t*t;
    }


    public static void main(String[] args) {
        System.out.println(myPow(2,-3));
    }
}
