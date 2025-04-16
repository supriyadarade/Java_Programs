package Ex_17_Oops;

public class Program_168_Cats {
    public static void main(String[] args) {

        Cat c1 = new Cat(); // one object
        Cat c2;             // Not an object it is reference
        new Cat();          // Object without reference

        c1.running();
       // c2.running();  // It will not come bcoz there is no object

        new Cat().running();
        System.out.println(new Cat().name);
    }
}
class Cat{
    String name ;   // Default value is null
    void running(){
        System.out.println("Running");
    }

}