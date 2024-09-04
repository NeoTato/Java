import java.util.Scanner;

class SumofTwo {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number_one = myObj.nextInt();
        System.out.print("Enter second number: ");
        int number_two = myObj.nextInt();

        int sum = number_one + number_two;
        System.out.println("The sum of " + number_one + " and " + number_two + " is " + sum);
        myObj.close();
    }
}
