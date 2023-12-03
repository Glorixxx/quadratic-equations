
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class StartOfStuding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your coaficients");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double D;
        D = (b * b) - (4 * a  * c);
        System.out.println(" D = " + D);
        if (D > 0) {
            double x1 = (-b + sqrt(D)) / 2;
            double x2 = (-b - sqrt(D)) / 2;
            System.out.println(x1 + "      " + x2);
        }
         else if (D < 0) {
            System.out.println(" No x");
        }
        if (D == 0) {
            double x = -b / (2 * a);
            System.out.println(x);
        }
    }
}