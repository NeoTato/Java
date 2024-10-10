import java.util.Scanner;

public class Calculator {
    public static void Add() {
        ;
    }

    public static void Subtract() {
        ;
    }

    public static void Multiply() {
        ;
    }

    public static void Divide() {
        ;
    }
    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Calculator");

        System.out.println("1.) Add\n2.) Subtract\n3.) Multiply\n4.) Divide");
        System.out.print("\nEnter option (1-4): ");
        int option = myObj.nextInt();
    }
}
