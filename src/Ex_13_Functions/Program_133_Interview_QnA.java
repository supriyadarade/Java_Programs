package Ex_13_Functions;

public class Program_133_Interview_QnA {

    public static void main(String[] args) {  // Main function
        // call function in the main function
        main(3.14f);
        main(10);
        main(10l);
        main(true);
    }

    public static void main(String args) {   // we can create main function with in the main function
    }

    public static int main(int args) {
        return 10;
    }

    public static float main(float args) {
        return 3.14f;
    }

    public static boolean main(boolean args) {
        return true;
    }

    public static long main(long args) {
        return 10l;
    }
}
