import java.util.Scanner;

public class Loops {
    public static void main (String [] args ) {
        Scanner in = new Scanner(System.in);

        //1. Program printing numbers 1-10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        //2. Program printing numbers 1-10 backwards
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        //3. Program printing all the odd numbers from 1-20
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        //4. Program printing all even numbers from 1-20
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        //5. Program printing all numbers from a number entered
        //by a user to 1
        int num1;
        System.out.println("Enter a number: ");
        num1 = in.nextInt();
        for (int i = num1; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        //6. Program to sum all values from 1-10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum from 1-10 is: " + sum);
        System.out.println(" ");

        //7. Program to sum all the numbers from a number entered by the
        //user to 1.
        int num2, sum2 = 0;
        System.out.println("Enter a number: ");
        num2 = in.nextInt();
        for (int i = num2; i >= 1; i--) {
            sum2 += i;
        }
        System.out.println("The sum is: " + sum2);

        //8. Loop to display a square made of *
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //9. Program to draw a triangle using *
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i >= j) {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //10. Program to print a backward triangle using *
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (i < j) {
                    System.out.print(" ");
                }
                else  {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }

    }
}
