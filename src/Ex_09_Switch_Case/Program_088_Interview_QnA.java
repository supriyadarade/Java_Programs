package Ex_09_Switch_Case;

import java.util.Scanner;

public class Program_088_Interview_QnA {

    public static void main(String[] args) {

        char ch = 'A';

        Scanner sc = new Scanner(System.in);


        switch (ch) {

            case 65 :
                System.out.println("Matched ASCII Value");
                break;

            default :
                System.out.println("ASCII Value Not Matched");
        }

    }
}
