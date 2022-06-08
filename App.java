

import java.util.Scanner;


public class App {
   
    static final Scanner inputScanner = new Scanner (System.in);
    
private static String getString(String prompt) {
    String stringInput = inputScanner.nextLine();
    return stringInput;
}

private static double getDouble(String prompt) {
    double doubleInput = inputScanner.nextDouble();
    return doubleInput;

}


public static void main (String [] args) {
double num1 = getDouble("Please type in a number: ");
double num2 = getDouble ("Please enter another number: ");
boolean optionYrN;
Calculator calculator = new Calculator();
double addResult = calculator.add(num1, num2);
double substractResult = calculator.substract(num1, num2);
double multiplyResult = calculator.multiply(num1, num2);
double divisionResult = calculator.divide(num1, num2);
System.out.println(addResult);
System.out.println(substractResult);
System.out.println(multiplyResult);
System.out.println(divideResult);
String optionYrN = getString("Do you wish to continue? ");
while (optionYrN==true) {
    num1 = getDouble (" Please type in a number: ");
    num2 = getDouble("Please enter another number: ");
    calculator = new Calculator();
    addResult = calculator.add(num1, num2);
    subsractResult = calculator.substract(num1, num2);
    multiplyResult = calculator.multiply(num1, num2);
    divideResult = calculator.divide(num1, num2);
    System.out.println(addResult);
    System.out.println(substractResult);
    System.out.println(multiplyResult);
    System.out.println(divideResult);
}
if (optionYrN!=true) {
    System.out.println("Goodbye...");
}


}
}
