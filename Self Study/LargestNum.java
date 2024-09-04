import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter #" + (i + 1) + " number: ");
            int input_number = myObj.nextInt();
            numbers[i] = input_number;
        }

        int num_one = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (num_one < numbers[i]) {
                num_one = numbers[i];
            } 
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("Largest number is: " + num_one);
        myObj.close();
    }
}
