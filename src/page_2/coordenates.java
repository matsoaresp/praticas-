package page_2;

import java.util.Scanner;

public class coordenates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();


        if (x > 0.0 && y <= 5.0 && y > 0.0) {
            System.out.println("Q1");
        }else if (x < 0.0 && y <= 5.0 && y > 0.0) {
            System.out.println("Q2");
        }else if (x > 0.0 && y <= 5.0) {
            System.out.println("Q4");
        }else if (x < 0.0 && y <= 5.0) {
            System.out.println("Q3");
        }else {
            System.out.println("Origem");
        }






        sc.close();
    }
}
