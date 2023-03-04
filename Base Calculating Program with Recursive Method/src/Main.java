public class Main {
    static int calculate(int base, int pow){
        if (pow == 0){
            return 1;
        }
        return calculate(base, pow-1) * base;
    }
    public static void main(String[] args) {
        System.out.println(calculate(2,4));
    }
}