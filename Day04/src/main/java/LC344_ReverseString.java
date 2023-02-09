import java.util.Arrays;

public class LC344_ReverseString {
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length -1;
        swap(s, i, j);
    }
    private static void swap(char[] arr, int i, int j){
        if (i<j){
            char temp = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
            swap(arr, i+1, j-1);
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
