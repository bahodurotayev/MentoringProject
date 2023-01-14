package _0JavaTask;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 14, 56, 1, 5};
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void sortingArray(int[] array){

    }
}
