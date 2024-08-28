import java.util.Scanner;

public class it24101060Lab5Q1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

       
        int min = num1;
        int max = num1;

        
        if (num2 < min) {
            min = num2;
        } else if (num2 > max) {
            max = num2;
        }

        
        if (num3 < min) {
            min = num3;
        } else if (num3 > max) {
            max = num3;
        }

        System.out.println("The smallest number is: " + min);
        System.out.println("The largest number is: " + max);
    }
}
