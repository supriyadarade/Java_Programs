package Ex_20_Polymorphism.Method_Overloading;

public class Program_187_Poly_Overloading {
    public static void main(String[] args) {

        MathOperations m1 = new MathOperations();
        int a1 = m1.add(3, 7);
        int a2 = m1.add(6, 65, 54);
        double a3 = m1.add(3, 10);
        System.out.println("Value of a1 -> " + a1);  // you simply write System.out.println(a1); this will only show you the value
        System.out.println("Value of a2 -> " + a2);  // This method is at the class level
        System.out.println("Value of a3 -> " + a3);
        System.out.print("Sum of a1, a2, a3 -> ");
        System.out.println(a1 + a2 + a3);
    }
}
class MathOperations{
    // In the same class when you have a method with
    // same name but different arguments

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }
}
