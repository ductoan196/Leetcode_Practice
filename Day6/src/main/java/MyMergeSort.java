import java.util.Arrays;

public class MyMergeSort {
    public static void main(String[] args) {
//        int[]a1 = {1,3,5,7,9};
//        int[]a2 = {2,4,6,8};
//        System.out.println(Arrays.toString(merge2Arrays(a1,a2)));

        int[] arr = {1,5,3,7,9,6};
        mergeSort(arr, 0,arr.length-1);
    }

    private static int[] mergeSort(int[] arr, int left, int right){
        //Mảng có duy nhất 1 phần tử -> chắc chắn sorted
        //lấy ra mảng có 1 phần tử

        if (left == right){//base condition
            return new int[]{arr[left]};
        }
        int mid = left +(right-left)/2;
        int[] a1 = mergeSort(arr, left,mid);
        int[] a2 = mergeSort(arr, mid+1, right);

        int[] res= merge2Arrays(a1,a2);
        System.out.println("Done merge tu " + left + "den "+ right);
        System.out.println(Arrays.toString(res));
        return res;
    }
    private static int[] merge2Arrays(int[] a1, int[] a2){
        //a1,a2 sorted

        int[]res = new int[a1.length + a2.length];

        int idx = 0; //current index for updating
        int i = 0; //for a1
        int j = 0; //for a2
        while (i< a1.length && j <a2.length){
            //break khi i hoac j chay het mang
            if (a1[i] <a2[j]){
                //phan tu dang xet tai a1< dang xet tai a2
                res[idx] = a1[i]; //them a[i] vào res
                i++;// tang i để xét phần tử kế tiếp
            } else{
                res[idx] = a2[j];
                j++;
            }
            // luôn luôn ưu tiên lấy phần tử nhỏ hơn nhét vào res
            idx++;
        }

        while (i<a1.length){ //a1 còn, chắc chắn a2 đã hết
            //điền tất cả phần tử còn lại a1 vào res
            res[idx] = a1[i];
            idx++;
            i++;
        }
        while (j<a2.length){
            res[idx] = a2[j];
            idx++;
            j++;
        }

        System.out.println("i =" + i + "------j= " +j);
        //i=2 -> a1[2] = 9;
        //j=4 => a2[4] không tồn tại vì tận cùng là a2[3] thôi
        return res;
        //return res[] duoc sap xep, merge tu a1, a2
        //1,2,3,4,5,6,7,8
    }
}
