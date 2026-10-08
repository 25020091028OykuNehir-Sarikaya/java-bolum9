
package Test_11;

import java.util.Scanner;
import tr.edu.istiklal.LinearEquation;

public class Test_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" a, b, c, d, e, f degerlerini giriniz: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
        equation.printResult();

        input.close();
    }
}