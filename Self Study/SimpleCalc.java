import java.util.Scanner;

public class SimpleCalc {
    static void End(Scanner myObj) {
        System.out.print("\nPress ENTER to continue...");
        myObj.nextLine();
        myObj.nextLine();    
    }
    static void Add(int num_one, int num_two) {
        int total = num_one + num_two;
        System.out.println("Total of " + num_one + " + " + num_two + " = " + total);
    }
    static void Subtract(int num_one, int num_two) {
        int difference = num_one - num_two;
        System.out.println("Difference of " + num_one + " - " + num_two + " = " + difference);
    }
    static void Multiply(int num_one, int num_two) {
        int product = num_one * num_two;
        System.out.println("Product of " + num_one + " * " + num_two + " = " + product);
    }
    static void Divide(int num_one, int num_two) {
        if (num_two == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            double quotient = (double) num_one / num_two;
            System.out.println("Quotient of " + num_one + " / " + num_two + " = " + quotient);
        }
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int option;

        do {
            System.out.println("Simple Calculator.");
            System.out.println("1.) Add \n2.) Subtract \n3.) Multiply \n4.) Divide \n5.) Exit");
            System.out.print("Enter an option (1-5): ");
            option = myObj.nextInt();
            if (option == 5) {
                System.out.println("\nExiting program...");
            } else if (option >= 1 && option <= 4) {
                System.out.print("Enter a number: ");
                int num_one = myObj.nextInt();
                System.out.print("Enter a second number: ");
                int num_two = myObj.nextInt();
                switch (option) {
                    case 1:
                        Add(num_one, num_two);
                        break;
                    case 2:
                        Subtract(num_one, num_two);
                        break;
                    case 3:
                        Multiply(num_one, num_two);
                        break;
                    case 4:
                            Divide(num_one, num_two);
                            break;
                }             
                End(myObj);
            } else {
                System.out.println("Invalid option. Enter a number from 1-5 only.");
                End(myObj);
            }
            System.out.println("");
        } while (option != 5);
        myObj.close();
    }
}
