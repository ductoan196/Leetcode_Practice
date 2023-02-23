public class Fibonacci {
    public static void main(String[] args) {
        int[] arr = new int[1000];
//        System.out.println(fibo2(5, arr));

        int[] a = {0,1,2,3,4,5,6,7,8};
//        System.out.println(sum(3,a));
        for (int i = 0; i < a.length; i++) {
            int n = a[i];
//            System.out.println("input n= " + n);
            long t1 = System.currentTimeMillis();
            long result1 = fibonacci(n);
            long t2 = System.currentTimeMillis();
            long result2 = fibo2(n, a);
            long t3 = System.currentTimeMillis();
        }
    }

    private static int sum(int n, int[]arr){
        //Đk dừng
        if(n < 0){
            return 0;
        }
        return arr[n] + sum(n-1, arr);
    }

    //arr[0] = f(0)
    //arr[1] = f(1)
    private static int fibo2(int n, int[] arr) {
        int count = 0;
//        System.out.println("start in= " + n);
        count++;
        if (n <= 2) {
//            System.out.println("start in= " + n);
            return 1;
        }
        if(arr[n] ==0){
            arr[n] = fibo2(n - 1,arr) + fibo2(n - 2,arr);
        }
//        System.out.println("end in= " + n);
        return arr[n];
        //memory caching
    }

    private static int fibonacci(int n) {
        int count = 0;
        count++;
//        System.out.println("start in= " + n);
        if (n <= 2) {
//            System.out.println("Start in " + n);
            return 1;
        }
        int result = fibonacci(n - 1) + fibonacci(n - 2);
//        System.out.println("end n = " + n);
        return result;
    }

    //duyệt mảng 2 chiều bằng lệ quy
}
