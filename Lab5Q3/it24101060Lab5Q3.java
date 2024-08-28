import java.util.Scanner;

public class it24101060Lab5Q3{
   
    private static final double ROOM_CHARGE_PER_DAY = 48000.00;
    private static final int DISCOUNT_10_PERCENT_DAYS = 3;
    private static final int DISCOUNT_20_PERCENT_DAYS = 5;
    private static final int DAYS_IN_DECEMBER = 31;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start date (day) of the reservation: ");
        int startDate = scanner.nextInt();

        System.out.print("Enter the end date (day) of the reservation: ");
        int endDate = scanner.nextInt();

            if (startDate < 1 || startDate > DAYS_IN_DECEMBER || endDate < 1 || endDate > DAYS_IN_DECEMBER) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than the end date.");
            return;
        }

        int daysReserved = endDate - startDate;

        double discountRate = 0.0;
        if (daysReserved >= DISCOUNT_20_PERCENT_DAYS) {
            discountRate = 0.20; // 20% discount
        } else if (daysReserved >= DISCOUNT_10_PERCENT_DAYS) {
            discountRate = 0.10; // 10% discount
        }

        
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY * (1 - discountRate);

        System.out.println("Number of days reserved: " + daysReserved);
        System.out.printf("Total amount to be paid: Rs %.2f\n", totalAmount);
    }
}
