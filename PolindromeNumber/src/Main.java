public class Main {
    static boolean isPalindrome(int number){
        //we will create reverse of given number
        int temp = number; //assign number to temp
        int reverseNumber = 0;
        int lastDigit;

        while (temp!=0){
            lastDigit = temp%10; //get last digit of number
            reverseNumber =(reverseNumber*10)+lastDigit; //to create reverse number multiply by 10 and add number each time
            temp /=10;
            //then reduce last digit of temp

            //for example given number is 242 and in first step:
            // 242%10 = 2
            // 0 +2 = 2 => first digit of the reverse number
            //242/10 = 24
            //in second step:
            //24%10 = 4
            // (2*10) + 4 = 24
            //24/10 = 2
        }
        return true;
    }
    public static void main(String[] args) {
        isPalindrome(101);

    }
}