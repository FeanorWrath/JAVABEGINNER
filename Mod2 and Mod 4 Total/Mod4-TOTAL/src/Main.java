import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total=0;


        for (boolean checknumber = true;checknumber;) {

            System.out.print("Enter Any Number: ");
           int  number = input.nextInt();
            if (number < 0) {
                System.out.print("You Entered Negative Number!!! ");
                checknumber = false;
            } else if (number % 2 != 0) {
                total = number + total;
                System.out.println("Total: " + total);
            }

        }
    }

}
