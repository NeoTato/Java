import java.util.Scanner;

public class MultiplicationNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Multiplication table of a given number");

            System.out.print("Enter a number: ");
            int num = myObj.nextInt();
            System.out.print("Enter how many multiplication of " + num + " to display: ");
            int length = myObj.nextInt();

            System.out.println("Multiplication of " + num);
            for (int i = 1; i < length + 1; i++) {
                int product = num * i;
                System.out.println(num + " * " + i + " = " + product);
            }

            System.out.print("\nDo you want to continue? ('1' for yes | '0' for no): ");
            choice = myObj.nextInt();
        } while (choice == 1);
        System.out.println("\nExiting program...");
        myObj.close();
    }
}
