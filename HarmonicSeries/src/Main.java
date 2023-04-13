import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any number: ");
        double number = input.nextInt();

        double counter = 1;
        double result = 0;

        while (counter <= number){

            result += (1/counter);
            counter ++;
        }
        System.out.print("Result: "+result);


    }
}