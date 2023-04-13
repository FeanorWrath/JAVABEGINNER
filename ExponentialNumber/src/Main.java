import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int toplam = 1;

        System.out.print("üssü alınacak sayı : ");
        int x = input.nextInt();

        System.out.print("üs olacak sayı : ");
        int y = input.nextInt();

        for (int i = 1; i <= y; i++) {

            toplam *= x;

        }
        System.out.println(toplam);

    }
}