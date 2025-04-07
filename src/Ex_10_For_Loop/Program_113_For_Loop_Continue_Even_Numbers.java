package Ex_10_For_Loop;

public class Program_113_For_Loop_Continue_Even_Numbers {

    public static void main(String[] args) {

        for (int i = 0 ; i < 50 ; i++) {
            if  (i % 2 == 0) {
                System.out.println("Even Number : " + i);
                continue;
            }
            System.out.println("Odd Number : " + i);
        }
    }
}

//     for (int i = 0 ; i < 50 ; i++) {
//           if  (i % 2 == 0) {           // In this it will generate only odd numbers bcoz we are printing even numbers
//                   continue;
//           }
//             System.out.println("Odd Number : " + i);
//     }

//     for (int i = 0 ; i < 50 ; i++) {
//           if  (i % 2 != 0) {           // Tn this it will generate even number
//                   continue;
//           }
//             System.out.println("Even Number : " + i);
//     }