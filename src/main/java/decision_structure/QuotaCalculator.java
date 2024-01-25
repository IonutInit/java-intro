package decision_structure;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;
        System.out.println("How many sales?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales >= quota){
            System.out.println("Good job!");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("Not good man, not good. You were " + salesShort + " short.");
        }
    }
}
