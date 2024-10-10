import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args)    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("String Vowel Counter");
        System.out.print("Enter string/text: ");
        String text = myObj.nextLine();
        text = text.toLowerCase();
        int vowelCount = 0;
        System.out.println("\ntext: " + text);
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelCount += 1;
            }
        }
        System.out.println("Vowel Count for string " + text + ": " + vowelCount);
    }
}
