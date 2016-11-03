package CalculatorManagement;
import java.util.*;

public class CalculatorRunner{

  public static void main(String[] args)
  {

  float num1;
  float num2;
  char operation;
  Scanner input = new Scanner(System.in);

  Calculator calculator = new Calculator();

  System.out.println("Enter your first value: "); 
       String number = input.next(); 
       num1 = Float.parseFloat(number);
       
  System.out.println("Enter in operation + - * /: ");
       operation = input.next().charAt(0);
      
  System.out.println("Enter your second value: ");
      String number2 = input.next();
      num2 = Float.parseFloat(number2);
        

    switch(operation) {
      case '+' : 
      {
        System.out.println(calculator.add(num1 , num2));
        break;
      }

      case '-':
      {
        System.out.println(calculator.subtract(num1, num2));
        break;
      }

      case '*':
      {
        System.out.println(calculator.multiply(num1, num2));
        break;
      }

      case '/':
      {
        System.out.println(calculator.divide(num1, num2));
        break;
      }

      default:
        System.out.println("Error!Incorrect character entered.");

    }
  }
}



