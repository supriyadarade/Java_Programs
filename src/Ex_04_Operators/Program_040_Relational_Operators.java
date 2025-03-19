package Ex_04_Operators;

public class Program_040_Relational_Operators {

    public static void main(String[] args) {

        //  <   -  Less Than
        //  <=  -  Less Than or Equal to
        //  >   -  Greater Than
        //  >=  -  Greater Than or Equal to
        //  ==  -  Equal To (But checking)
        //  !=  -  Not Equal to

        // All of them will result boolean output

        int a = 10;
        int b = 20;

        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);

        int age_supriya = 31;
        int  age_satish = 32;
        boolean Result1 = age_supriya < age_satish; // Both are same
        boolean Result2 = age_supriya <= age_satish; // Both are same

        System.out.println(Result1);
        System.out.println(Result2);


    }
}
