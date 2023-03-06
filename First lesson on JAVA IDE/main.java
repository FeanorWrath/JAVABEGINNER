import java.sql.SQLOutput;
import java.util.Scanner;

public class main {

     public static  void main(String [] args){

          Scanner input = new Scanner(System.in);

           int a,b,c,d;

          System.out.println("A sayısını giriniz: ");
          a = input.nextInt();

          System.out.println("B sayısını giriniz: ");
          b = input.nextInt();

          System.out.println("C sayısını giriniz: ");
          c = input.nextInt();

          d = a*b ;

          System.out.println("SONUCUNUZ  " +d);

          boolean kosul1 = d < c ;

          String str = kosul1 ? "DOĞRU" : "YANLIŞ";
          System.out.println(str);





     }




}
