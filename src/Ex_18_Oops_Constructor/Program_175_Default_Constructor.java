package Ex_18_Oops_Constructor;

public class Program_175_Default_Constructor {
    public static void main(String[] args) {
        A a1 = new A();
    }
}

class A{
    A(){
        System.out.println("DC");  // if the constructor is not created but it is still created in the background
    }
}
