package page_1;

import java.util.Scanner;

public class cedulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cedula = sc.nextInt();

        int centena = cedula / 100;
        int resto = cedula % 100;

        int cinquenta = resto / 50;
        resto = resto % 50;

        int vinte = resto / 20;
        resto = resto % 20;

        int dez = resto / 10;
        resto = resto % 10;

        int cinco = resto / 5;
        resto = resto % 5;

        int dois = resto / 2;
        resto = resto % 2;


        System.out.println(cedula);
        System.out.println(centena+" nota(s) de R$ 100,00");
        System.out.println(cinquenta+" nota(s) de R$ 50,00");
        System.out.println(vinte+" nota(s) de R$ 20,00");
        System.out.println(dez+" nota(s) de R$ 10,00");
        System.out.println(cinco+" nota(s) de R$ 5,00");
        System.out.println(dois+" nota(s) de R$ 2,00");
        System.out.println(resto+ " nota(s) de R$ 1,00");


    }
}
