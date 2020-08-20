package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr= {1,5,3,7,11,9,15};
        System.out.println("Original Array: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    private static void reverse(int[] arr){
        int maxIndex = arr.length-1;
        int halfLength= arr.length/2;
        for(int i=0; i<halfLength; i++){
            int temp= arr[i];
            arr[i]= arr[maxIndex-i];
            arr[maxIndex]= temp;
        }
    }
}
