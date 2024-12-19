package array;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args){
        double[] array = {3.1, 87.2, 12.3, 98.4, 2.5, 4.6, 66.7};
        System.out.println(Arrays.toString(sortArray(array)));
    }

    private static double[] sortArray(double[] array) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1; j++){
                if (array[j] < array[j + 1]){
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}