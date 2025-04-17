package Ex_19_Inheritance.Hierarchical_Inheritance;

public class Program_185_Hierarchical {

    public static void main(String[] args) {
        Father f1 = new Father();
        Supriya s1 = new Supriya();
        Pramod p1 = new Pramod();
        Ruhani r1 = new Ruhani();

        f1.home();
        s1.home();
        p1.home();
        r1.home();
    }
}

class Father {
    void home(){
        System.out.println("3BHK");
    }
}

class Supriya extends Ruhani {
    void s1(){
        System.out.println("S2 - Supriya");
    }
}

class Pramod extends Father {
    void p1(){
        System.out.println("P2 - Pramod");
    }
}

class Ruhani extends Father{
    void r1(){
        System.out.println("R2 - Ruhani");
    }
}