package classes;

public class Calculator {

    int a,b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int Addition(int a, int b){
        return a+b;
    }
    public int Subtraction(int a, int b){
        return a-b;
    }
    public void Multiplication(){
        System.out.println(a*b);
    }
    public void Division(){
        System.out.println(a/b);
    }
}
