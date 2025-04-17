package Ex_20_Polymorphism.Method_Overloading;

public class Program_188_Real_Overloading  {
    public static void main(String[] args) {
        Home h1 = new Home();
        h1.task(6);
        h1.task(9, 1);
        h1.task(7, 56, 2);
    }
}
class Home {

    void task(int a){
        System.out.println(a);
    }

    void task(int a, int b){
        System.out.println(a+b);
    }

    void task (int a, int b, int c){
        System.out.println(a+b+c);
    }
}
