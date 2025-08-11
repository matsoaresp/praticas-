package page_3;

import java.util.Scanner;

public class restTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i < 1000; i++){

               if (i % n == 2) {
                   System.out.println(i);
               }
        }
        sc.close();
    }
}
