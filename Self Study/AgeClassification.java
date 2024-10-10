import java.util.Scanner;

public class AgeClassification {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String choice;
        do {
            System.out.println("User Age Classification");

            int age;
            System.out.print("Enter age: ");
            age = myObj.nextInt();
            if (age <= 12 && age > 0) {
                System.out.println("At " + age + " years old, you are a child!");
            } else if (age >= 13 && age <= 19) {
                System.out.println("At " + age + " years old, you are a teenager!");
            } else if (age >= 20 && age <= 35) {
                System.out.println("At " + age + " years old, you are an adult!");
            } else if (age >= 36 && age < 100) {
                System.out.println("At " + age + " years old, you are a senior!");
            } else if (age >= 100) {
                System.out.println("At " + age + " years old, you are a vampire!");
            } else {
                System.out.println("At " + age + " years old, you aren't even born yet!");
            }
            System.out.print("\nDo you want to continue? (yes|no): ");
            choice = myObj.next().toLowerCase();
            System.out.println("");
        } while (!choice.equals("no"));
        myObj.close();
    }
}
