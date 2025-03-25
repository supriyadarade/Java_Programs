package Ex_06_Ternary_Operator;

public class Program_067_TO_Three_Max {
    public static void main(String[] args) {

        int n1 = 2;
        int n2 = 5;
        int n3 = -11;

        // Logic building formula

        // Step 1 : Find Inputs and Outputs
        // I/O : n1, n2, n3 - int
        // O/P : string - Max Number (Always ask from interviewer which datatype they want)

        // Step 2 : Rough Logic, think about it.
        // n1 > n2 and n1 > n3 -- n1 is greater
        // n2 > n1 and n2 > n3 -- n2 is greater
        // n3

        int max = (n1>n2) ? (n1>n3) ? n1 : n3 : ((n2>n3) ? n2 : n3);
        System.out.println("Max is " + max);

        // eq - A - (n1>n3) ? n1 : n3 -- we only go to this condition when it n1 is greater than n2
        // eq - B - ((n2>n3) ? n2 : n3) -- we only go to this condition when it n1 is less than n2


    }
}
