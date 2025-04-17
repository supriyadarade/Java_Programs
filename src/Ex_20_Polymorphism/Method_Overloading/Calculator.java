package Ex_20_Polymorphism.Method_Overloading;

public class Calculator {

    public int add(int a, int b){
        System.out.println(a+b);
        return a+b;
    }

    public double add(double a, double b){
        System.out.println(a+b);
        return a+b;
    }

    public static void main(String[] args) { // main function i have written below

        Calculator c1 = new Calculator();
        c1.add(6, 2);
        c1.add(5.2, 9.3);
    }
}
