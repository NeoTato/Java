import java.util.Scanner;

class OddEvenChecker {
    public static void main(String[] args) {
        System.out.println("Odd or Even Checker");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = myObj.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an even number!");
        } else {
            System.out.println(num + " is an odd number!");
        }
        myObj.close();
    }
}
