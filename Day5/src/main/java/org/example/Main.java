package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,	4,	9,	12,	19,	25,	31,	46,	50,	57,	72};
        System.out.println(binarySearch(arr,31));
        System.out.println(binarySearchRec(arr,31,0,arr.length-1));
    }
    private static int binarySearch(int[] arr, int target){
        int left = 0, right = arr.length-1;
        while (left <=right){
            int mid = (left + right)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid]<target){
                left = mid +1;
            } else {
                //range: left -> mid -1
                right = mid -1;
            }
        }
        //left>right
        return -1;
    }

    private static int binarySearchRec(int[]arr, int target, int left, int right){
        //dieukienchung
        if (right <left){
            return -1;
        }
        int mid = (left + right)/2;
        if(arr[mid] == target){
            return mid;
        }
        if (arr[mid]<target){
            return binarySearchRec(arr,target,mid+1,right);
        }
        return binarySearchRec(arr,target,left, mid-1);
    }
}