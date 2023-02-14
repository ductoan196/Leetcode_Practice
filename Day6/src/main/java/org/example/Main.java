package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] a1 = {1,3,5,8};
//        int[] a2 = {2,4,6,9,10};
//
//        System.out.println(Arrays.toString(merge2arrays(a1,a2)));

        int[] arr= {1,5,9,3,8,4};
        int[] rs = mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(rs));
    }

    private static int[] mergeSort(int[]arr, int left, int right){
        int mid = left + (right -left)/2;
        if (left == right){
            return new int[]{arr[left]};
        }
        int[] a1 = mergeSort(arr,left,mid);
        int[] a2 = mergeSort(arr,mid+1,right);
        int[] rs = merge2arrays(a1,a2);

        return rs;
    }

    private static int[] merge2arrays(int[]a1, int[]a2){
        int i = 0;
        int j = 0;
        int idx = 0;
        int[] rs = new int[a1.length+ a2.length];

        while (i<a1.length && j <a2.length){
            if (a1[i] < a2[j]){
                rs[idx] = a1[i];
                i++;
            }else {
                rs[idx] = a2[j];
                j++;
            }
            idx++;
        }
        while (i<a1.length){
            rs[idx] = a1[i];
            idx++; i++;
        }
        while (j<a2.length){
            rs[idx] = a2[j];
            idx++; j++;
        }
        return rs;
    }
}