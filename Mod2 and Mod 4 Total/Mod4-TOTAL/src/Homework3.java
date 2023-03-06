import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("ENTER ANY NUMBER : ");
        int number = input.nextInt();

        for (int i = 1 , k = 1 ; i < number && k < number; i *= 4 , k*=5) {
            System.out.println("multiples of four :  " + i);
            System.out.println("multiples of five: " +k);
        }

    }
}
