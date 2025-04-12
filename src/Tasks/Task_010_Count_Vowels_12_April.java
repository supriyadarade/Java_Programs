package Tasks;

import java.sql.SQLOutput;

public class Task_010_Count_Vowels_12_April {

    public static void main(String[] args) {

        String input = "Java Programming to Count and Consonants";
        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();
        System.out.println(input);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                vowels = vowels + 1;  // or you can use vowels++;
            }
            else {
                consonants = consonants + 1; // or you can use consonants++;
            }
        }
        System.out.println("The count of vowels -> " + vowels);
        System.out.println("The count of consonants -> " + consonants);
    }
}
