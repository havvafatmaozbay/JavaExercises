import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       int x = scan.nextInt();
       int count = 0;s
       for (int i = 2; i<x;i++){
           if(x%i == 0){
              count+= 1;
           }

       }
       if(count >0){
           System.out.println("Number is not prime");
       }
       else{
           System.out.println("Number is prime");
       }
    }
}