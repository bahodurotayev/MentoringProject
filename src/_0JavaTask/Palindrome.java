package _0JavaTask;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length()-1; i < s.length()/2 ; i++, j--) {
         if(s.charAt(i) != s.charAt(j)){
             return false;
         }
        }
       return true;
    }

    public static void main(String[] args) {
        int str = 12133121;
        boolean palindrome = isPalindrome(str);
        System.out.println(palindrome);
    }

    public static Boolean isPalindrome(int number){
        int temp = 0;
        while (number > temp){
            temp = (temp * 10) + number%10;
            number /= 10;
        }
        return temp == number || temp/10 == number;
    }
}
