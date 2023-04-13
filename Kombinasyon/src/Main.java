import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int toplam = 1 , toplam2 = 1;

        System.out.print("Kombinasyon Üst parametresini giriniz :  ");
        int n = input.nextInt();

        System.out.print("Kombinasyon alt parametresini giriniz :  ");
        int r = input.nextInt();

        for(int i = 1 ; r < n ; i++){

            toplam *=n;
            toplam2 *=i;
            n--;
        }
        int ko = toplam / toplam2;
        System.out.println("kombinasyon sonucu : "+ko);





    }
}