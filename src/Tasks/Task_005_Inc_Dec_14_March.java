package Tasks;

public class Task_005_Inc_Dec_14_March {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);

        // --a    -> ExpA -> 19 , a = 19
        // +
        // a++    -> ExpB -> 19 , a = 20
        // +
        // a--    -> ExpC -> 20 , a = 19
        // A+B+C  -> ExpA + ExpB + ExpC -> 19+19+20 = 58
    }
}
