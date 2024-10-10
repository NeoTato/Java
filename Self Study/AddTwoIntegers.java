import java.util.Scanner;

public class AddTwoIntegers {
    public static int addTwoIntegers(int num_one, int num_two) {
        int result = num_one + num_two;
        return result;
    }

    public static int subtractTwoIntegers(int num_one, int num_two) {
        int result = num_one - num_two;
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

            int Sum = addTwoIntegers(num_one, num_two);
            System.out.println("Sum: \n" + num_one + " + " + num_two + " = " + Sum);

            int Diff = subtractTwoIntegers(num_one, num_two);
            System.out.println("Difference: \n" + num_one + " + " + num_two + " = " + Diff);

            System.out.print("Continue? (yes | no): ");
            choice = myObj.next().toLowerCase();
        } while (!choice.equals("no"));
        myObj.close();
    }
}
