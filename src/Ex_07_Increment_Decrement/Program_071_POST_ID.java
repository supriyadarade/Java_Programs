package Ex_07_Increment_Decrement;

public class Program_071_POST_ID {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a);
        System.out.println(a);

        // POST Increment = Print first and then increase
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);
    }
}
