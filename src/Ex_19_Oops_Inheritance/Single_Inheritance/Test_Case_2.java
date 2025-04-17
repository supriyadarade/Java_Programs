package Ex_19_Oops_Inheritance.Single_Inheritance;

public class Test_Case_2 extends Common_To_All {
    void runningTC2(){
        startBrowser();
        System.out.println("Running Test Case 2");
        readDataBaseFile();
        readExcelFile();
        closeBrowser();
    }
}
