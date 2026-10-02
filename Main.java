import java.util.Scanner;

public class Main{
       public static void main(String args[])
       {
           showTitle();
        
         Scanner scan = new Scanner(System.in);

         char choice = 'y';
         while(choice == 'y' || choice=='Y')
        {
         System.out.println("Enter your number1 : ");
         if (!scan.hasNextDouble())
         {
              System.out.println("Invalid Input");
              scan.next();
              continue;
         } 
       double num1 = scan.nextDouble();

       System.out.println("Enter the operator +, -, *, /, %: ");
       char operator = scan.next().charAt(0);

        System.out.println("Enter your number2 : ");
         if (!scan.hasNextDouble())
         {
              System.out.println("Invalid Input");
              scan.next();
              continue;
         } 
       double num2 = scan.nextDouble();

       double result;
       switch (operator)
       {
       case '+':
              result = addNumbers(num1, num2);
              break; 

       case '-':
              result = subNumbers(num1, num2);
              break;

         case '*':
              result = mulNumbers(num1, num2);
              break;

        case '/':
              if(num2 == 0){
                     System.out.println("Cannot divide by zero");
                   continue;
              }
              else {
              result = divNumbers(num1, num2);
              }
              break;

        case '%':
              result = modNumbers(num1, num2);
              break;

         default:
         System.out.println("Invalid operator");  
        continue;

       }
     
       System.out.println("Result:"+num1+" "+operator+" "+num2 + " "+ "= " +result);
      
      System.out.println("Do you want to continue? (y/n)");
choice = scan.next().charAt(0);

while (choice != 'y' && choice != 'Y' && choice != 'n' && choice != 'N') {
    System.out.println("Invalid choice");
    System.out.println("Please enter y or n:");
    choice = scan.next().charAt(0);
}
       
       }
        System.out.println("Program closed");

        scan.close();
   } 
          static  double addNumbers(double num1, double num2)
          {
             return num1 + num2;
          }

           static  double subNumbers(double num1, double num2)
          {
             return num1 - num2;
          }


           static  double mulNumbers(double num1, double num2)
          {
             return num1 * num2;
          }


           static  double divNumbers(double num1, double num2)
          {
             return num1 / num2;
          }
          

           static  double modNumbers(double num1, double num2)
          {
             return num1 % num2;
          }


   static void showTitle(){
              System.out.println("====================");
              System.out.println("Java Calculator");     
              System.out.println("===================="); 
            }

}
      
       
