import java.util.Scanner;

public class NumberRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a three digit number:");
        int number = scan.nextInt();

        int a = number / 100;
        int b = (number / 10) % 10;
        int c = number % 10;

        System.out.printf("%s%s%s", c, b, a);
    }
}
