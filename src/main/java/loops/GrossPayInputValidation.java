package loops;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args) {
        double rate = 14;
        double maxHours = 39;

        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours){
            System.out.println("Invalid entry. Try again");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        double grossPay = hoursWorked * rate;
        System.out.println("Gross pay: " + grossPay);
    }


}
