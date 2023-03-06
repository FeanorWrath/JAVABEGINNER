import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double mesafe , tutar ,  toplamTutar ;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen mesefa kaç km  : ");
         mesafe = input.nextDouble();
        tutar  = 10 + (mesafe*2.2);
        toplamTutar = (tutar < 20)? 20 : tutar ;

        System.out.print("Ödemeniz Gereken Ücret: "+toplamTutar);

    }
}