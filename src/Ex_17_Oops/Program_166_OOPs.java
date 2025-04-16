package Ex_17_Oops;

public class Program_166_OOPs {
    public static void main(String[] args) {
        Person amit;   // Nothing will happen bcoz we are not printing it
        // Person - class
        // p2 - Object reference name
        // new person() - Object
        Person p2 = new Person();
        p2.name = "Lucky";
        System.out.println(p2.name);

        Person p3 = new Person();
        p3.name = "Supriya";
        System.out.println(p3.name);
    }
}
class Person{
    // Attributes | Properties | Data Members | Instance Variables

    String name;
    String phone;
    String color_eye;
    int legs;
    double salary;
    byte age;
    double weight;
    boolean ismale;
    double height;

    // Behaviour | Functions | Methods
    void sleep() {
        System.out.println("I am Sleeping");
    }

    String greet(String name) {
        return "Hello" + name;
    }

    void talk() {
        System.out.println("Talking");
    }

    int remaining_amount_salary (int salary, int tax){
        return salary-tax;
    }
}

