import java.util.Scanner;

public class IT24102245Lab5Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double roomCharge = 48000.00;
        int startDate, endDate;
        double discountRate1, discountRate2, totalPayment;
        int numberOfDaysReserved;

        
        System.out.println("Enter start Date (1 - 31): ");
        startDate = input.nextInt();
        System.out.println("Enter end Date (1 - 31): ");
        endDate = input.nextInt();

        
        if (startDate >= endDate) {
            System.out.println("Start Date must be less than End Date");
            return;
        }

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Days must be between 1 and 31.");
            return;
        }

        
        numberOfDaysReserved = endDate - startDate;

        
        if (numberOfDaysReserved < 3) {
            System.out.println("No discount");
            discountRate1 = 0;
            discountRate2 = 0;
            totalPayment = roomCharge * numberOfDaysReserved;
        } else if (numberOfDaysReserved < 5) {
            discountRate1 = 0.1 * roomCharge;  
            System.out.println("Discount Applied: 10%");
            totalPayment = (roomCharge - discountRate1) * numberOfDaysReserved;
        } else {
            discountRate2 = 0.2 * roomCharge;  
            System.out.println("Discount Applied: 20%");
            totalPayment = (roomCharge - discountRate2) * numberOfDaysReserved;
        }

        
        System.out.println("Room Charge Per Day: Rs. " + roomCharge);
        System.out.println("Total Amount to be Paid: Rs. " + totalPayment);
    }
}
