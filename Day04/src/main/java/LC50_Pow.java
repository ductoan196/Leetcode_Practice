public class LC50_Pow {
    public static double myPow(double x, int n) {
        return poww(x,n);
    }

    private static double poww(double x, long n){
        if (x==0){
            return 0;
        }
        if (n ==0){
            return 1;
        }
        if (n<0){
            x = 1/x;
            n = -n;
        }
        if (n%2 ==0){
            return poww(x*x, n/2);
        }
        return x*poww(x*x, n/2);
    }

}
