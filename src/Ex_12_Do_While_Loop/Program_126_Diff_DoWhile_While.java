package Ex_12_Do_While_Loop;

public class Program_126_Diff_DoWhile_While {

    public static void main(String[] args) {

        int a = 0;
        while (a < 0) {            // the condition is not true so this while loop will not be excepted
            System.out.println(a);
            a++;
        }

        do {
            System.out.println(a); // DoWhile loop will executed only 1 time
            a++;
        }
        while (a < 0);
    }
}
