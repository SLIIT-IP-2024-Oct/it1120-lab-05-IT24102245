import java.util.Scanner;

public class IT24102245Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int discount, startDate, endDate, noOfDays;
        int roomChargePerDay = 48000;
        int minDaysForDiscount = 3;
        double discountRate, totalAmount;

        System.out.println("Enter End Date: ");
        endDate = input.nextInt();

        System.out.println("Enter Start Date: ");
        startDate = input.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate >31) {
            System.out.println("Error: Dates must be Between 1 and 31. ");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than end Date. ");
            return;
        }
        
        noOfDays = endDate - startDate;

        discountRate = 0.0;
        if (noOfDays >= minDaysForDiscount) {
            discountRate = (noOfDays >= 5)? 0.2 : 0.1;
        }

        totalAmount = roomChargePerDay*noOfDays*(1 - discountRate);

        System.out.println("Number of Days Reserved: " + noOfDays);
        System.out.println("Total Amount to be Paid: " + totalAmount);

        input.close();
    }
}