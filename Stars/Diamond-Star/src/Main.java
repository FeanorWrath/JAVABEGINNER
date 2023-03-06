import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int starN = klavye.nextInt();

        for (int i = 0; i <= starN ; i++) {
            for (int j = 0; j < (starN - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int u = 0 ; u <= starN-1 ; u++) {
            for (int l = 0; l <= u; l++) {
                System.out.print(" ");
            }
            for (int j =1; j < (2*starN-2*u) ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}