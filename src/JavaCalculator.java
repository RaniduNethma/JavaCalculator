import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args){

        char operator;
        double numb1, numb2, result = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Choose an operator: +, -, *, /, ^, or % : ");
        operator = input.next().charAt(0);

        System.out.print("Enter first number : ");
        numb1 = input.nextDouble();

        System.out.print("Enter second number : ");
        numb2 = input.nextDouble();

        switch (operator){

            case '+':
                result = numb1 + numb2;
                break;

            case '-':
                result = numb1 - numb2;
                break;

            case '*':
                result = numb1 * numb2;
                break;

            case '/':
                result = numb1 / numb2;
                break;

            case '^':
                result = Math.pow(numb1, numb2);
                break;

            case '%':
                result = numb1 % numb2;
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        System.out.println(numb1 + " " + operator + " " + numb2 + " = " + result);
        input.close();
    }
}
