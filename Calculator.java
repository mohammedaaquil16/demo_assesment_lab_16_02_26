import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        int num = 20;
        int num1 = 10;
        int num3 = 0; // Initialize with 0 to avoid "variable might not have been initialized" error
        char n = '+';

        switch (n) {
            case '+':
                num3 = num + num1;
                break; // 'break' exits the switch once a match is found
            case '-':
                num3 = num - num1;
                break;
            case '*':
                num3 = num * num1;
                break;
            case '/':
                if (num1 != 0) {
                    num3 = num / num1;
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        System.out.println("Result: " + num3);
    }
}
