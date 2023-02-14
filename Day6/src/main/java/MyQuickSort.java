import java.util.Arrays;

public class MyQuickSort {
    public static void main(String[] args) {
        //pivot = 9;
        //chia lam 2 phan
        //left <9
        //right >9
        int[] a = {9,7,5,8,4,1,2};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int[]arr, int low, int high){
        int sortedItem = partition(arr, low, high);//tim duoc 1 phan tu sorted
        quickSort(arr, low, sortedItem-1);
        quickSort(arr, low,high);
    }
    private  static int partition(int[]arr, int low, int high){
        int pivot = arr[low];
        int left = low +1;
        int right = high;
        while (true) {
            //tìm phần tử phía bên trái mà > pivot
            while (left<=right && arr[left]<pivot ){
                left++;
            } // tim duoc arr[left] >pivot
            while (left<=right && arr[right] > pivot ){
                right--;
            }
            if (left>=right){
                break;
            }
            swap(arr,left,right);
            left++;
            right--;
        }
        swap(arr,low,right);
        return right;
    }
    private static void swap(int[]arr, int i, int j){
        int tmp = arr[i];
        arr[i]= arr[j];
        arr[j]= tmp;
    }
}
