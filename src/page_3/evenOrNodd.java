package page_3;

import java.util.Scanner;

public class evenOrNodd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String print;
        String prints = "";
        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();
            if (x % 2 == 0 && x > 0) {
                print = "EVEN POSITIVE \n";
            }else if (x % 2 != 0 && x > 0) {
                print = "ODD POSITIVE \n";
            }else if (x % 2 == 0 && x < 0) {
                print ="EVEN NEGATIVE \n";
            }
            else if  (x % 2 != 0) {
                print = "ODD NEGATIVE \n";
            }else{
                print = "NULL \n";
            }
            prints += print;
        }
        System.out.println(prints);
        sc.close();
    }
}
