package day03;

import java.util.Arrays;
import java.util.Locale;

public class Task2 {/* Given two String, determine if they are anagram.
        s = "aNagram";
        t = "Nagaram";
        return true;
        if they dont share same char return falsel*/
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean b = checkAnagram2(s, t);
        System.out.println(b);
    }
    public static boolean checkAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }

        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        System.out.println(Arrays.toString(charS));
        System.out.println(Arrays.toString(charT));

        Arrays.sort(charS);
        Arrays.sort(charT);

        System.out.println("=============================================");

        System.out.println(Arrays.toString(charS));
        System.out.println(Arrays.toString(charT));

        for (int i = 0; i < charS.length; i++) {
            if(charS[i] !=  charT[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean checkAnagram2(String s, String t){
        int[] sArray = new int[26];
        int[] tArray = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i)-'a']++;
            tArray[t.charAt(i)-'a']++;
        }

        for (int i = 0; i < 26; i++) {
         if(sArray[i] != tArray[i]){
             return false;
             }
        }
        return true;
    }
}
