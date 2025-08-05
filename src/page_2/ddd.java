package page_2;

import java.util.Scanner;

public class ddd {

    public static String exibirDDD(int opcao) {

        return switch (opcao) {
            case 61 -> "Brasilia";
            case 71 -> "Salvador";
            case 11 -> "São Paulo";
            case 21 -> "Rio de Janeiro";
            case 32 -> "Juiz de Fora";
            case 19 -> "Campinas";
            case 27 -> "Vitoria";
            case 31 -> "Belo Horizonte";
            default -> "DDD Não encontrado";
        };
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        String nome = exibirDDD(opcao);
        System.out.println(nome);
    }
}
