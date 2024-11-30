import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args){

        String operator;
        double numb1, numb2, result = 0;

        while (true){

            Scanner input = new Scanner(System.in);

            System.out.print("Choose an operator: +, -, *, /, ^, or % : ");
            operator = input.nextLine();

            if (operator.equals("+") || operator.equals("-") || operator.equals("*") ||
                    operator.equals("/") || operator.equals("^") || operator.equals("%")){

                System.out.print("Enter first number : ");
                numb1 = input.nextDouble();

                System.out.print("Enter second number : ");
                numb2 = input.nextDouble();

                switch (operator){

                    case "+":
                        result = numb1 + numb2;
                        break;

                    case "-":
                        result = numb1 - numb2;
                        break;

                    case "*":
                        result = numb1 * numb2;
                        break;

                    case "/":
                        if (numb2 != 0){
                            result = numb1 / numb2;
                        }
                        else {
                            System.out.println("Cannot divide by zero");
                        }
                        break;

                    case "^":
                        result = Math.pow(numb1, numb2);
                        break;

                    case "%":
                        result = numb1 % numb2;
                        break;

                    default:
                        System.out.println("Invalid operator!");
                        break;
                }

                if (numb2 != 0){
                    System.out.println(numb1 + " " + operator + " " + numb2 + " = " + result + "\n");
                }
            }
        }
    }
}
