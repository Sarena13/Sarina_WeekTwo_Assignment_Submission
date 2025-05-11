/*Even or Odd Checker Write a Java program that checks if a number (taken as input)
 is even or odd using an if-else statement.*/
import java.util.Scanner;
public class EvenOddChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();  // Take integer input from user
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        scanner.close();
    }
}


