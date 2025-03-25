package Tasks;

public class Task_004_Inc_14_March {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        // ++a    -> ExpA -> 11 , a = 11
        // +
        // a++    -> ExpB -> 11 , a = 12
        // +
        // a++    -> ExpC -> 12 , a = 13
        // A+B+C  -> ExpA + ExpB + ExpC -> 11+11+12 = 34
    }
}
