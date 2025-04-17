package Ex_19_Oops_Inheritance.MultiLevel_Inheritance;

public class Program_183_Multilevel_Inheritance {
    public static void main(String[] args) {

        Grand_father gf1 = new Father();
        gf1.home();
        Grand_father gf2 = new Son();
        gf2.home();

        System.out.println("----------");

        Father f2 = new Son();
        f2.home();
        // Dynamic Dispatch
        // Father f3 = new Grand_father();

        System.out.println("----------");

        Son amit = new Son();
        amit.home();
        // Son s1 = new Grand_father();
        // Son s2 = new Father();

        // WebDriver driver = new ChromeDriver();
    }
}
