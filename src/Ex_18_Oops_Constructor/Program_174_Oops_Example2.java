package Ex_18_Oops_Constructor;

public class Program_174_Oops_Example2 {
    public static void main(String[] args) {

        WebAutomation W1 = new WebAutomation(); // Bcoz of this new WebAutomation(); the below class is called
    }
}

class WebAutomation{

    WebAutomation() {
    System.out.println("I want to read a CSV File");
    System.out.println("Open the Page before loading the scripts");
    System.out.println("Y0u can do anything which you want to do, when Object is created.");
    // FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}