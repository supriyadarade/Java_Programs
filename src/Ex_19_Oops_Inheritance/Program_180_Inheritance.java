package Ex_19_Oops_Inheritance;

public class Program_180_Inheritance {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println("Fathers gold -> " + f1.gold_f);
        f1.bhk2();
        // f1.bhk3();

        Son s1 = new Son();
        s1.bhk3();
        System.out.println("Fathers gold -> " + s1.gold_f); // Father gold can son - extend
        s1.bhk2(); // Father 2 BHK
    }
}

class Father{
    int gold_f = 1000; // Attribute | Data variables |  Property | Instance Variables

    void bhk2() { //  Behaviour |  Method | Function | Data members
        System.out.println("Father - 2BHK");
    }
}
class Son extends Father {
//    we added extend so the fathers property or code automatically added to the son class

//    int gold_f = 1000; // Attribute | Data variables |  Property | Instance Variables
//    void bhk2() { //  Behaviour |  Method | Function | Data members
//        System.out.println("Father - 2BHK");
//    }

    void bhk3() {
        System.out.println("Son - 3Bhk");
    }
}