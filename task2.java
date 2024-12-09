/*
В переменной day лежит какое-то число из интервала от 1 до 31.
Определите в какую декаду месяца попадает это число
(в первую, вторую или третью).
 */

public class task2 {
    public static void main(String[] args){
        int day = 21;
        if (day <= 10){
            System.out.println("1 декада");
        } else {
            if (day >= 11 && day <= 20) {
                System.out.println("2 декада");
            } else {
                System.out.println("3 декада");
            }
        }
    }
}
