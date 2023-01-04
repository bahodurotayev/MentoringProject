package _0JavaTask;

import java.util.HashSet;

public class Task1 {
    /*Given an integer array nums, return true if any value appears at least twice in the array,
    and return false if every element is distinct*/
    public static boolean distinctNumber(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 7, 8};
        int[] arr2 = {11, 2, 3, 4, 5, 5, 6, 7, 8};
        boolean b = distinctNumber(arr2);
        System.out.println(b);
    }
    public static boolean distinctNumber2(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                if (nums[i] == nums[j]){
                  return true;
                }
            }
        }
        return false;
    }
}
