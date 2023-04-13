import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter ANY NUMBER:  ");
        int number = in.nextInt();


        for (int i = 1; i <= number; i++) {

            int k = (int) Math.pow(2, i);
            if (k > number) {
                break;
            }
            System.out.println(k);
        }


    }
}