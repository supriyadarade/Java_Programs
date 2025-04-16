package Ex_18_Oops_Constructor;

public class Program_176_DC {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Tesla";
        System.out.println("Name of car -> " + c1.name);
        System.out.println("Year of Car2 -> " + c1.year);
        System.out.println("Model of car -> " + c1.model);

        System.out.println("--------------");

        Car c2 = new Car();
        System.out.println("Name of car -> " + c2.name);
        System.out.println("Year of Car2 -> " + c2.year);
        System.out.println("Model of car -> " + c2.model);
    }
}
class Car{
    String name;
    int year;
    String model;

    Car(){
        name = "BMW";
        year = 1991;
        model = "xxx";
    }
}
