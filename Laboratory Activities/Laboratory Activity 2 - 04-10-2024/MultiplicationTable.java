import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int n = myObj.nextInt();

        int[][] arr2D = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2D[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("Multiplication Table: ");
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D.length; j++) {
                int number = arr2D[i][j];
                System.out.printf("%4d", number);
            }
            System.out.println();
        }

        myObj.close();
    }
}
