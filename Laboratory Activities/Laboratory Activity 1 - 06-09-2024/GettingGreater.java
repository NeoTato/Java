import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Getting the Greater Value");

        System.out.print("Enter first character: ");
        char char_1st = myObj.next().charAt(0);
        System.out.print("Enter second character: ");
        char char_2nd = myObj.next().charAt(0);

        System.out.println("------------------------------------------");
        System.out.println("The character with greater value is: " + (char) Math.max(char_1st, char_2nd));
        System.out.println("------------------------------------------");
        System.out.println("Showing the ASCII Codes");
        System.out.println("------------------------------------------");
        System.out.println(char_1st + " : " + (int) char_1st);
        System.out.println(char_2nd + " : " + (int) char_2nd);

        myObj.close();
    }
}