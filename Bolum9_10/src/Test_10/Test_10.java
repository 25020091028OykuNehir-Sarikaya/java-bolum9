
package Test_10;

import java.util.Scanner;
import tr.edu.istiklal.QuadraticEquation;

public class Test_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.print(" a, b, c degerlerini giriniz : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        
        QuadraticEquation eq = new QuadraticEquation(a, b, c);
        System.out.println(eq.getResult());

        input.close();
    }
}
