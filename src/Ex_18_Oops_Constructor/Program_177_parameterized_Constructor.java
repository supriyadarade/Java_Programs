package Ex_18_Oops_Constructor;

public class Program_177_parameterized_Constructor {
    public static void main(String[] args) {

        Car2 c1 = new Car2();
        Car2 c2 = new Car2();

        System.out.println(c1.name);
        System.out.println(c2.name);

        Car2 c3 = new Car2("Tesla","Model 3" , 2015);
        System.out.println(c3.name);

        Car2 c4 = new Car2("Mahindra", "Scorpio", 2020);
        System.out.println(c4.name);

        Car2 c5 = new Car2("CURVV", "TATA", 2024);
        System.out.println(c5.name);
    }
}
class Car2{

    // DC
    String name;
    int year;
    String model;

    Car2(){
        name = "BMW";
        year = 1991;
        model = "xxx";
        System.out.println("DC");
    }

    // parameterized_Constructor
    Car2 (String name_oc_arg , String model_oc_arg , int year_oc_arg) {
        this.name = name_oc_arg;
        this.model = model_oc_arg;
        this.year = year_oc_arg;

    }
}
