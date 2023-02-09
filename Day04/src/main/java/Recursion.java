public class Recursion {
    public static void main(String[] args) {
//        print(0);
//        System.out.println(factorial(0));
//        System.out.println(factorial(1));
//        System.out.println(factorial(2));
//        System.out.println(factorial(3));
        System.out.println(factorial(4));
    }
    private static void doSomething(){
        int mySum = sum(1,2);
        System.out.println(mySum);
    }

    private static int sum(int a, int b){
        return a + b;
    }
    private static void print(int n){
        //dieu kien dung cua de quy
        if (n>3){
            return;
        }
        System.out.println("start: n = "+ n);
        print(n+1);
        System.out.println("end: n = " + n);

    }

    private static int factorial(int n){
        System.out.println("start n = " + n);
        if (n==0){
            System.out.println("end n = " + n);
            return 1;
        }
        //công thức quy nạp, tổng quát
        int result = n*factorial(n-1);
        System.out.println("end n= " + n);
        return result;
    }
}
