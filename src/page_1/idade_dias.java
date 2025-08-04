package page_1;

import java.util.Scanner;

public class idade_dias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dias = sc.nextInt();
        int ano = dias / 365;
        int resto = dias % 365;

        int mes = resto / 30;
        int diasRestantes = resto % 30;

        System.out.println("Ano: "+ano);
        System.out.println("Mes: "+mes);
        System.out.println("Dias: "+diasRestantes);

    }
}
