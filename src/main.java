// Import the Scanner class from the java.util package.
import java.util.Scanner;

// Declare a public class called "main".
public class main {
  // Declare a static void method called "main" that takes in an array of Strings as its argument.
  public static void main(String[] args) {
    // Create a new Scanner object called "input".
    Scanner input = new Scanner(System.in);

    // Print a message asking the user to enter their age.
    System.out.print("Enter your age: ");

    // Read the user's input as an integer and store it in a variable called "age".
    int age = input.nextInt();

    // Check if the user's age is greater than or equal to 21, and if so, print a message indicating they get a wrist band.
    if (age >= 21) {
      System.out.println("You get a wrist band.");
    }
  }
}
