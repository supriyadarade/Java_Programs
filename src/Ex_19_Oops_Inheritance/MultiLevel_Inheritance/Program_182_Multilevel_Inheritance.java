package Ex_19_Oops_Inheritance.MultiLevel_Inheritance;

public class Program_182_Multilevel_Inheritance {
    public static void main(String[] args) {

        Grand_father gf = new Grand_father();
        gf.gf();

        System.out.println("-----------------");

        Father f = new Father();
        f.gf();
        f.f();

        System.out.println("----------------");

        Son s1 = new Son();
        s1.gf();
        s1.f();
        s1.s();
    }
}
