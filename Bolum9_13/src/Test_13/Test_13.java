package Test_13;

import java.util.Locale;
import java.util.Scanner;
import tr.edu.istiklal.Location;

public class Test_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        double[][] array = new double[rows][columns];

        System.out.print("Enter the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        Location location = Location.locateLargest(array);

        System.out.println("The location of the largest element is "
            + location.maxValue+ location.row + " " + location.column );
    }
}