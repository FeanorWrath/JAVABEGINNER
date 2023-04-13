import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat , fizik , kimya , turkce , tarih , muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz:");
         mat = input.nextInt();

        System.out.println("Fizik Notunuzu Giriniz:");
         fizik = input.nextInt();

        System.out.println("Kimya Notunuzu Giriniz:");
         kimya = input.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz:");
         turkce = input.nextInt();

        System.out.println("Tarih Notunuzu Giriniz:");
         tarih = input.nextInt();

        System.out.println("muzik Notunuzu Giriniz:");
         muzik = input.nextInt();

         int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

         double ort = toplam / 6;

        System.out.println(ort);
        String str = (ort>=60)? "GEÇTİ" : "KALDI";
        System.out.println("DURUM " +str);


    }
}