package calculate;

public class Calculator {

    double result;


    public void addition(int a, int b) {
        result = a+b;
        System.out.println("Result : "+result);
    }

    public void subtraction(int a, int b) {
        result = a -b;
        System.out.println("Result : "+result);
    }

    public void division(int a, int b) {
        result = a/b;
        System.out.println("Result : "+result);
    }

    public void multiplication(int a, int b) {
        result = a*b;
        System.out.println("Result : "+result);
    }

    public void calculateresult(int a, int b, char symbol) {


        switch (symbol) {

            case '+':
                addition(a,b);
                break;
            case '-':
                subtraction(a,b);
                break;

            case '/':
                division(a,b);
                break;
            case '*':
                multiplication(a,b);
                break;
            default:
                System.out.println("Invalid symbol");
        }
    }
}
