import java.lang.System;
import java.util.Scanner;

public class Main{
       public static void main(String args[])
       {
        System.out.println("Java Calculator");

         Scanner scan = new Scanner(System.in);

         System.out.println("Enter your number1 : ");
       double num1 = scan.nextDouble();

        System.out.println("Enter your number2 : ");
       double num2 = scan.nextDouble();

       double result = num1 + num2;

       System.out.println("Result: " +result);
       scan.close();
       }
}
      
       
