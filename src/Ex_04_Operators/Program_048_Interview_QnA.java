package Ex_04_Operators;

public class Program_048_Interview_QnA {

    public static void main(String[] args) {

        int balaji_salary = 12;
        boolean b = !(balaji_salary > 10 || balaji_salary < 5);

        //  A  --  balaji_salary > 10  --  12 > 10  --  True
        //  B  --  balaji_salary < 5  --  12 > 5  --  False
        //  !(A || B)  -- !(Ture || False)   --  !True  --  False

        System.out.println(b);
    }
}
