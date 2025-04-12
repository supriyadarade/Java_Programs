package Ex_15_StringBuffer_StringBuilder_String_Functions;

public class Program_143_String_Functions_2 {

    public static void main(String[] args) {

        String name= "Supriya";

        // 1. length()
        // It will find out the characters length
        System.out.println(name.length());

        // 2. charAt()
        // It will find out the character at the 3rd place
        System.out.println(name.charAt(3));

        // 3. concat()
        // It will merge the characters with the string
        System.out.println(name.concat("Darade"));

        // 4. contains()
        // It will check the characters is present in the string
        System.out.println(name.contains("satish"));

        // 5. equals()
        // It will check the characters are matching with the string
        System.out.println(name.contains("Supriya"));

        // 6. equalsIgnoreCase()
        // It will check the characters are matching with the string
        System.out.println(name.contains("supriya"));

        // 7. indexOf()
        // It will check the characters at which position s-0, u-1, p-2, r-3, i-4, y-5, a-6
        System.out.println(name.indexOf("u"));

        // 8. replace( , )
        // It will replace the old char with the new char
        System.out.println(name.replace('p', 'P'));

        // 9. split()
        // It will split the string
        String str = "supriya@live.com@123";
        String[] split = str.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        // 10. substring( , )
        // It will
        System.out.println(name.substring(1 , 3));

        // 11. toUpperCase()
        // It will make the string in the upper case
        System.out.println(name.toUpperCase());

        // 12. toLowerCase()
        // It will convert the string in the lower case
        System.out.println(name.toLowerCase());

        // 13. startWith()
        // It will tell that string start with character
        System.out.println(name.startsWith("S"));

        // 14. endWith()
        // It will tell that string end with character
        System.out.println(name.endsWith("a"));

        // 15. trim()
        // It will remove the spaces
        String name2 = "     Supriya    Darade   ";
        System.out.println(name2.trim());

        // 16. compareToo()
        // It will then it will give 1 and if not match then it will give 0
        System.out.println(name.compareTo("supriya"));

        StringBuilder stringBuilder = new StringBuilder("supriya");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());

        String string1 = "Niagara. O roar again!";
        String roar = string1.substring(11, 15);
        System.out.println(roar);

        String s11 = "Pramod";
        String s21 = s11.concat("Dutta");
        System.out.println(s21);

        // Concatenation (By +)

        String s111 = "Hello";
        String s222 = "World";
        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1);

        String n = "PRamoddUTTA";
        System.out.println(n.indexOf("d"));
        System.out.println(n.lastIndexOf("d"));
        System.out.println(n.lastIndexOf("s"));
    }
}
