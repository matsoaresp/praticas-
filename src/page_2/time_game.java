package page_2;

import java.util.Scanner;

public class time_game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int init_hour = sc.nextInt();
        int final_hour = sc.nextInt();

        int time = init_hour - final_hour;
        int calculate = 24 - time;
        int calc = calculate - 24;


            if (time < 0){
                System.out.println("O JOGO DUROU "+ calc+" HORA(S)");
            }
            else {
                System.out.println("O JOGO DUROU " +calculate+" HORA(S)");
            }
        sc.close();
    }
}
