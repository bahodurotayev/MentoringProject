package _0JavaTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {
    /*Create a method which will have as a parameter an array of strings.
         Return a Map<String, Boolean> where each different string is a key and
         its value is true if that string appears 2 or more times in the array.

         Example:
         ["a", "b", "a", "c", "b"]
         Result:
         {"a": true, "b": true, "c": false}*/
    public static Map<String, Boolean> booleanMapAppearance(String[] str){
        Map<String, Boolean> map = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if(str[i].equals(str[j]) && i != j){
                    map.put(str[i], true);
                    break;
                }else if(!str[i].equals(str[j]) && i != j) {
                    map.put(str[i], false);
                }
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String[] str = {"a", "b", "c", "a", "b", "d"};
        Map<String, Boolean> map = booleanMapAppearance(str);
        System.out.println(map);
    }
}
