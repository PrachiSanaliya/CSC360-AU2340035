import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int square = number * number;

        System.out.println("Square = " + square);

        scanner.close();
    }
}