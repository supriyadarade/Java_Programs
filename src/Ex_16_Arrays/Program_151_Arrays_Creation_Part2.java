package Ex_16_Arrays;

public class Program_151_Arrays_Creation_Part2 {

    public static void main(String[] args) {

        String[] names = {"Supriya" , "Siya" , "Satish"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[1]);

        String[] names1 = new String[3];
        names1[0] = "Sunita";
        names1[1] = "Shivaji";
        names1[2] = "Sourabh";
        System.out.println(names1.length);
        System.out.println(names1[0]);
        System.out.println(names1[1]);
        System.out.println(names1[2]);

        boolean[] data = new boolean[2];
        data[0] = true;
        data[1] = false;
        System.out.println(data.length);
        System.out.println(data[0]);
        System.out.println(data[1]);
    }
}
