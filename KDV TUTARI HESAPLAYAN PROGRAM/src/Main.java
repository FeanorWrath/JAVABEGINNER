import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar , kdv1=0.18 , kdv2=0.08 , kdvtutar , kdvoran ;


        Scanner input=new Scanner(System.in);
         System.out.println("Tutar Giriniz: ");
           tutar = input.nextDouble();
             kdvoran = (tutar < 1000)?  kdv1  : kdv2 ;
            kdvtutar = (tutar < 1000)? kdv1*tutar : kdv2*tutar;
          System.out.println("KDV'siz Fiyat = " + tutar);
        System.out.println("KDV Oranı = "+kdvoran);
       System.out.println("KDV'li Fiyat = " +(kdvtutar+tutar));
     System.out.println("KDV Tutarı =  "+kdvtutar);


    }
}