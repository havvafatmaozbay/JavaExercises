public class Main {
    static boolean isPalindrome(int number){
        //sayının aynısının tersini oluşturucaz eğer ikisi eşitse palindrom diyeceğiz
        int temp = number;
        int reverseNumber = 0;
        int lastDigit;

        while (temp!=0){
            lastDigit = temp%10;
            reverseNumber =(reverseNumber*10)+lastDigit;
            temp /=10;
        }
        return true;
    }
    public static void main(String[] args) {
        isPalindrome(101);

    }
}