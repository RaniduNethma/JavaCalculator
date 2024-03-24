import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args){

        char operator;
        Double numb1, numb2, result; //create operator

        Scanner input = new Scanner(System.in); //create scanner class

        System.out.println("Choose an operator: +, -, *, /, or %");
        operator = input.next().charAt(0); // user input for operator

        System.out.println("Enter first number");
        numb1 = input.nextDouble(); //user input for number 01

        System.out.println("Enter second number");
        numb2 = input.nextDouble(); //user input for number02

        switch (operator){

            case '+': //addition
                result = numb1 + numb2;
                System.out.println(numb1 + "+" + numb2 + "=" + result);
                break;

            case '-': //subtraction
                result = numb1 - numb2;
                System.out.println(numb1 + "-" + numb2 + "=" + result);
                break;

            case '*': //multiplication
                result = numb1 * numb2;
                System.out.println(numb1 + "*" + numb2 + "=" + result);
                break;

            case '/': //division
                result = numb1 / numb2;
                System.out.println(numb1 + "/" + numb2 + "=" + result);
                break;

            case '%': //percentage
                result = numb1 % numb2;
                System.out.println(numb1 + "%" + numb2 + "=" + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}
