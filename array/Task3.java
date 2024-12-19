package array;

public class Task3 {
    public static void main(String[] args){
        int[] array = {6, 117, 44, 5, 32, 81, 9};
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }
    }
}
