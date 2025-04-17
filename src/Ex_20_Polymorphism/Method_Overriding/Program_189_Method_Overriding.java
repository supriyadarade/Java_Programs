package Ex_20_Polymorphism.Method_Overriding;

public class Program_189_Method_Overriding {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
        Cat c1 = new Cat();
        c1.sound();
    }
}
class Animal {
    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{
  @Override
    void sound(){
        System.out.println("Bark!!");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Mau!!");
    }
}
