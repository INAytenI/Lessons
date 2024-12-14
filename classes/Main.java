/*
Создать класс Calculator(Калькулятор) для выполнения основных арифметических операций. Он содержит два поля: a и b.
Написать методы вычисления суммы, разности, произведения и частного. Методы суммы и разности принимают входные параметры a и b и возвращают результат соответствующих операций.
Методы произведения и частного необходимо написать с типом возвращаемого значения void (ничего не возвращают) и результат этих операций внутри метода выводится в консоль методом System.out.println().
 */


package classes;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator(10,5);

        System.out.println(calculator.Addition(5,10));
        System.out.println(calculator.Subtraction(10,6));

        calculator.Multiplication();
        calculator.Division();
    }
}
