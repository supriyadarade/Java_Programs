package Ex_04_Operators;

public class Program_042_Interview_Concat_Plus {

    public static void main(String[] args) {
        // Concatenation do addition of strings
        System.out.println("Supriya" + "Darade");

        int a1 = 10;
        int b1 = 20;
        System.out.println(a1 + b1);

        String name1 = "Supriya";
        String name2 = "Darade";
        System.out.println(name1 + name2);

        // Practice
        String a = "Supriya";
        String b = "Satish";
        char c = '\u2764';

        System.out.println(a+b);

        System.out.printf("%s %c %s",a ,c ,b );
        System.out.println( );

        System.out.print(a +  c +  b);
        System.out.println( );

        System.out.print(a);
        System.out.print(c);
        System.out.print(b);

        //  +  -  Behave differently with the data types
        //  +  -  Operator Overloading


    }
}
