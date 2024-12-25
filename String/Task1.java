package String;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args){
        String[] stringArray = {"ab", "cd", "ef"};
        char[] charArray = String.join("",stringArray).toCharArray();
        System.out.println(charArray);
    }
}
