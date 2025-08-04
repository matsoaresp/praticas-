package page_2;

import java.util.Scanner;

public class lanche {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        double quantidade = sc.nextDouble();
        double total;
        switch (code) {
            case 1:
                total = 4.00 * quantidade;
                System.out.println(total);
                break;
            case 2:
                total = 4.50 * quantidade;
                System.out.println(total);
                break;
            case 3:
                total = 5.00 * quantidade;
                System.out.println(total);
                break;
            case 4:
                total = 2.00 * quantidade;
                System.out.println(total);
                break;
            case 5:
                total = 1.50 * quantidade;
                System.out.println(total);
            default:
        }
    }
}
