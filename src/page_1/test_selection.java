package page_1;

import java.util.Scanner;

public class test_selection {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int somaCeD = c + d;
        int somaAeB = a + b;



        if (b > c & d > a & somaCeD > somaAeB & a > 1 & b > 1 & c > 1 & d > 1 & a % 2 == 0) {
            System.out.println("Valores aceitos");
        }else {
            System.out.println("Valores nao aceitos");
        }

        sc.close();
    }
}
