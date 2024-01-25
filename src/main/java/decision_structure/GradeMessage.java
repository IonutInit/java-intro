package decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch(grade){
            case "A":
                message = "Noice";
                break;
            case "B":
                message = "Yay";
                break;
            case "C":
                message = "Meh";
                break;
            default:
                message = "Error!";
                break;
        }

        System.out.println(message);
    }
}
