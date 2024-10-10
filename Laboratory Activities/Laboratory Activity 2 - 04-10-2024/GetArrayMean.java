import java.util.Scanner;

public class GetArrayMean {

    public static float getArrayMean(int[] arr) {
        float result = 0f;
        for (int number : arr) {
            result += number;
        }
        
        result = result / arr.length;
        return result;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = myObj.nextInt();

        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            arr[i] = myObj.nextInt();
        }

        float arrayMean = getArrayMean(arr);
        System.out.println("Mean of array is: " + String.format("%.2f", arrayMean));

        myObj.close();
    }
}
