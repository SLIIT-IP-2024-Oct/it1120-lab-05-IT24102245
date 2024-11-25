import java.util.Scanner;

public class IT24102245Lab5Q1 {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Declare the integers
        int numberOne, numberTwo, numberThree;
        int smallest, largest;

        // Read three integers from the user
        System.out.print("Enter the first integer: ");
        numberOne = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        numberTwo = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        numberThree = scanner.nextInt();

        // Assign the first number to both smallest and largest
        smallest = numberOne;
        largest = numberOne;

        // Compare numberTwo with smallest and largest
        if (numberTwo < smallest) {
            smallest = numberTwo;
        }
        if (numberTwo > largest) {
            largest = numberTwo;
        }

        // Compare numberThree with smallest and largest
        if (numberThree < smallest) {
            smallest = numberThree;
        }
        if (numberThree > largest) {
            largest = numberThree;
        }

        // Output the results
        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);

        // Close the scanner to avoid memory leak
        scanner.close();
    }
}
