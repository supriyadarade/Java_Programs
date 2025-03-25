package Ex_05_Type_Casting;

public class Program_061_TypeCasting_Use {

    public static void main(String[] args) {

        int course = 100;
        float GST = 18.45f;

        // int Total = course + GST; - Narrow - Implicit is not possible
        int Total1 = course + (int)GST; // Narrow - Explicit is possible

        System.out.println(Total1);

        float Total2 = course + GST; // widening auto implicit
        float Total3 = (float)course + GST; // widening auto Explicit

        System.out.println(Total2);
        System.out.println(Total3);
    }

}
