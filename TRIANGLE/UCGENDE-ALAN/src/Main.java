import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double kenarA , kenarB , kenarC , cevre , s , alan;
            Scanner input = new Scanner(System.in);

        System.out.print("Birinci Kenar Uzunluğu Giriniz : ");
         kenarA = input.nextDouble();
        System.out.print("İkinci Kenar Uzunluğu Giriniz : ");
         kenarB = input.nextDouble();
        System.out.print("Ücüncü Kenar Uzunluğu Giriniz : ");
         kenarC = input.nextDouble();

        cevre = kenarA + kenarB + kenarC;
        s = cevre/2;
        alan = Math.sqrt(s*(s-kenarA)*(s-kenarB)*(s-kenarC));
        System.out.println("Cevre " + cevre);
        System.out.println("Alan " + alan);


    }
}