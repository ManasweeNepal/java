
import java.util.Scanner;
public class  Lab1{
    public static void main(String[] args) {
        int num1;
        int num2;
        int addition;
        int subtraction;
        int multiplication;
        float division;
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the first number: ");
         num1 = scanner.nextInt();

      
        System.out.print("Enter the second number: ");
         num2 = scanner.nextInt();

       
         addition = num1 + num2;
         subtraction = num1 - num2;
         multiplication = num1 * num2;
         division = num1/num2;

       
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println(" division" +  division);
      

       
        scanner.close();
    }
}
    
