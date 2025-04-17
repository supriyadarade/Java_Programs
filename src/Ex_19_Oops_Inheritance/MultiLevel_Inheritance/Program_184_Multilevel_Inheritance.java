package Ex_19_Oops_Inheritance.MultiLevel_Inheritance;

public class Program_184_Multilevel_Inheritance {
    public static void main(String[] args) {
        Son amit = new Son();
        amit.gf();
        amit.f();
        amit.s();
        amit.home();
        System.out.println(amit.gold_gf);

        System.out.println("------------");

        Father f1 = new Father();
        f1.home();

        System.out.println("------------");

        Grand_father gf1 = new Grand_father();
        gf1.home();

        System.out.println("------------");

        Grand_father gf2 = new Son();
        gf2.home();
    }
}
