import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        int total1=0;
        int total2= 0;

        for(int i = 1; i<number1;i++){
            if(number1%i == 0){
                total1+=i;
            }
        }
        for(int j=1;j<number2;j++){
            if(number2%j==0){
                total2+=j;
            }
        }
        if(total1==number2 && total2==number1){
            System.out.println("These numbers are Friend Numbers");
        }
        else{
            System.out.println("These numbers are not Friend Numbers");
        }
    }
}