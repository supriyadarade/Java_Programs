package Ex_18_Oops_Constructor;

public class Program_173_Oops_Constructor {

    public static void main(String[] args) {

        Baby b1 = new Baby();
        new Baby();
        Baby b2;
    }
}

class Baby{
    // Attributes
    String name;

    // Behaviour
    void cry (){
        System.out.println("Crying");
    }

    void sleep(){
        System.out.println("Sleeping");
    }
    void eat(){
        System.out.println("Eat");
    }

    // Default constructor
    Baby(){
        System.out.println("I am called default constructor");
        // Fetch data from the MySQL database
        // Read from the CSV file, XLSX
        // Open a file and read the data.(json, testdata.xlsx, txt file )
    }

}

