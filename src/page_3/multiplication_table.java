package page_3;

import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 2 || n >= 1000) {
            return;
        }
        for(int i = 1; i <= 10; i++){
            int tabuada = i * n;
                System.out.println(""+i+" x "+n+ " = " +tabuada);
            }
        }
    }

