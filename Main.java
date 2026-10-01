import java.lang.System;
import java.util.Scanner;

public class Main{
       public static void main(String args[])
       {
        System.out.println("Java Calculator");

         Scanner scan = new Scanner(System.in);

         System.out.println("Enter your number1 : ");
       double num1 = scan.nextDouble();

       System.out.println("Enter the operator +, -, *, /, %: ");
       char operator = scan.next().charAt(0);


        System.out.println("Enter your number2 : ");
       double num2 = scan.nextDouble();

       double result;
       switch (operator)
       {
       case '+':
              result = num1 + num2;
              break; 

       case '-':
              result = num1 - num2;
              break;

         case '*':
              result = num1 * num2;
              break;

        case '/':
              if(num2 == 0){
                     System.out.println("Cannot divide by zero");
                     return;
              }
              else {
              result = num1 / num2;
              }
              break;

        case '%':
              result = num1 % num2;
              break;

         default:
         System.out.println("Invalid operator");  
         scan.close();
         return;
       }

       System.out.println("Result: " +result);
       scan.close();
       }
}
      
       
