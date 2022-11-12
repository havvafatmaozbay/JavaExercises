
import java.util.Scanner;


public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number :");
        int number = scan.nextInt();
         System.out.println("Please enter the digit number :");
        int digit_number = scan.nextInt();
        int sum = 0;
        int temp = number;
        do{
          int digit = temp%10;  
          temp/= 10;
          sum += Math.pow(digit, digit_number);
          
        }while(temp > 0);
        if(number==sum){
            System.out.println("This is a Armstong Number");
        }
        else{
            System.out.println("This is not an Armstrong Number");
        }
    }
}
