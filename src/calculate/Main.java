package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char result;

        Calculator obj = new Calculator();

        do {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number : ");
            int a = sc.nextInt();

            System.out.print("Enter second number : ");
            int b = sc.nextInt();

            System.out.print("Enter symbol +,-,*,/ : ");
            char symbol = sc.next().charAt(0);

            obj.calculateresult(a, b, symbol);

            System.out.println("Would you like to do more calculation Please enter " + 'Y' + " or " + 'N');
            result = sc.next().charAt(0);

        } while (result == 'y' || result == 'Y');

    }
}
