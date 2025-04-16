package Ex_17_Oops;

public class Program_Person2 {
    public static void main(String[] args) {
        System.out.println("Bye");
    }
}

class P1{}
class P2{}
// class 123{} // numbers not allowed
class $123{}
class _123{}
// class a b {}
class P3{}
// class P3{} same class not allowed

class P4{};

class P5{
    class P6{
        class P7{
            class P8{}
        }
    }
}

class P8 {
    // after jvm 13 it is allowed to use the classes with there own main function
    public static void main(String[] args) {
        System.out.println("Hi");
    }
}

class P10 {
    public static void main(String[] args) {
        System.out.println("P10");
    }
}