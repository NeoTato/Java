import java.util.Scanner;

public class VowelCounterExtra {
    public static void main(String[] args)    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("String Vowel Counter");
        System.out.print("Enter string/text: ");
        String text = myObj.nextLine();
        text = text.toLowerCase();

        int vowelCount = 0;
        int a_count = 0, e_count = 0, i_count = 0, o_count = 0, u_count = 0;

        System.out.println("\ntext: " + text);

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            switch (letter) {
                case 'a':
                    a_count++;
                    vowelCount++;
                    break;
                case 'e':
                    e_count++;
                    vowelCount++;
                    break;
                case 'i':
                    i_count++;
                    vowelCount++;
                    break;
                case 'o':
                    o_count++;
                    vowelCount++;
                    break;
                case 'u':
                    u_count++;
                    vowelCount++;
                    break;
                default:
                    break;
            } /* same logic with switch, but uses if statements
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelCount++;
            }   if (letter == 'a') {
                a_count++;
            }   if (letter == 'e') {
                e_count++;
            }   if (letter == 'i') {
                i_count++;
            }   if (letter == 'o') {
                o_count++;
            }   if (letter == 'u') {
                u_count++;
            } */

        }
        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("a: " + a_count + "\te:" + e_count);
        System.out.println("i: " + i_count + "\to:" + o_count);
        System.out.println("u: " + u_count);
    }
}
