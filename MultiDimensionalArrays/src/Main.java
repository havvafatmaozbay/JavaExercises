import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row = 0;
        int column = 0;
        String[][] cities = new String[2][2];
        for( row = 0; row<cities.length;row++){
            for( column = 0; column<cities[row].length; column++){
                Scanner scan = new Scanner(System.in);
                cities[row][column] = scan.nextLine();

            }

        }
        // This method is designed for converting multidimensional arrays to strings. The simple toString() method works well for simple arrays, but doesn’t work for multidimensional arrays.
        System.out.println(Arrays.deepToString(cities));

    }

}