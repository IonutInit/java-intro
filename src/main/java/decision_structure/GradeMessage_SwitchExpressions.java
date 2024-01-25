package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {
    public static void main(String[] args) {
        System.out.println("Enter your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message =  switch(grade){
            case "A" -> "Noice";
            case "B" ->  {
                yield "Yay";
            }
            case "C" ->  "Meh";
            default ->  "Error!";
        };

        System.out.println(message);
    }
}
