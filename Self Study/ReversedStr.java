import java.util.Scanner;

public class ReversedStr {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String origString = myObj.nextLine(); // Fuck you Velz = 12
        String reversedString = "";

        for (int i = 0; i < origString.length(); i++) {
            reversedString = origString.charAt(i) + reversedString;
        }

        System.out.println("Reversed String: " + reversedString);
        myObj.close();
    }
}