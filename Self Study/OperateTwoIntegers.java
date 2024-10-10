import java.util.Scanner;

public class OperateTwoIntegers {
    public static int addTwoIntegers(int num_one, int num_two) {
        int result = num_one + num_two;
        return result;
    }

    public static int subtractTwoIntegers(int num_one, int num_two) {
        int result = num_one - num_two;
        return result;
    }

    public static int multiplyTwoIntegers(int num_one, int num_two) {
        int result = num_one * num_two;
        return result;
    }
    public static void main(String[] args) {
        String choice;
        Scanner myObj = new Scanner(System.in);
        do {
            System.out.print("Enter the first integer: ");
            int num_one = myObj.nextInt();
            
            System.out.print("Enter the second integer: ");
            int num_two = myObj.nextInt();

            System.out.println("");

            int Sum = addTwoIntegers(num_one, num_two);
            System.out.println("Sum: \n" + num_one + " + " + num_two + " = " + Sum);

            int Difference = subtractTwoIntegers(num_one, num_two);
            System.out.println("Difference: \n" + num_one + " - " + num_two + " = " + Difference);

            int Product = multiplyTwoIntegers(num_one, num_two);
            System.out.println("Product: \n" + num_one + " * " + num_two + " = " + Product);

            System.out.print("\n\nContinue? (yes | no): ");
            choice = myObj.next().toLowerCase();
        } while (!choice.equals("no"));
        myObj.close();
    }
}
