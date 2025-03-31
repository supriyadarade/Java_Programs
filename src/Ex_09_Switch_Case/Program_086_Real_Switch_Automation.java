package Ex_09_Switch_Case;

import java.util.Scanner;

public class Program_086_Real_Switch_Automation {

    public static void main(String[] args) {

        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to i will start the automation in the browser

        //  String browser = args[0];
        //  System.out.println(browser);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the browser name : ");
        String browser = scanner.next();

        switch (browser) {

            case "chrome" :
                System.out.println("Starting the chrome browser");
                System.out.println("Execute the test cases");
                System.out.println("chrome TC-1");
                System.out.println("chrome TC-2");
                System.out.println("chrome TC-3");
                break;

            case "firefox" :
                System.out.println("Starting the firefox browser");
                System.out.println("Execute the test cases");
                System.out.println("firefox TC-1");
                System.out.println("firefox TC-2");
                System.out.println("firefox TC-3");
                break;

            case "mozzarella" :
                System.out.println("Starting the mozzarella browser");
                System.out.println("Execute the test cases");
                System.out.println("mozzarella TC-1");
                System.out.println("mozzarella TC-2");
                System.out.println("mozzarella TC-3");
                break;

            case "edge" :
                System.out.println("Starting the mozzarella edge");
                System.out.println("Execute the test cases");
                System.out.println("edge TC-1");
                System.out.println("edge TC-2");
                System.out.println("edge TC-3");
                break;

            default :
                System.out.println("I have no idea which browser is this ");
                break;
        }
    }
}
