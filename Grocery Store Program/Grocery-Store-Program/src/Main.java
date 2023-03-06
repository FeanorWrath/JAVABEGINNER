import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double wPear , wApple , wTomato , wBanana , waur , price ;
         Scanner input = new Scanner(System.in);
        System.out.print("How much kg is  pear: ");
         wPear = input.nextDouble();
          wPear *= 2.14;
        System.out.print("How much kg is  Apple: ");
         wApple = input.nextDouble();
          wApple *= 3.67;
        System.out.print("How much kg is  Tomato: ");
         wTomato = input.nextDouble();
          wTomato *= 1.11;
        System.out.print("How much kg is Banana: ");
          wBanana = input.nextDouble();
           wBanana *= 0.95;
        System.out.print("How much kg is aurbergine: ");
          waur = input.nextDouble();
           waur *= 5;

        price   = wPear + wApple +wTomato + wBanana +waur;
         System.out.print("Totaly Price is "+price);

    }
}

