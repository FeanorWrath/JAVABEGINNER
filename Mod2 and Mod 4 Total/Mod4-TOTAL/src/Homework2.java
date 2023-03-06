import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0 , number;

        do{
            System.out.print("Enter Any Number: ");
            number = input.nextInt();

            if (number%2 == 1 ){
                System.out.print("you entered wrong number");
            } else if (number%4 == 0){
                total += number;
                System.out.println(+total);
            }
        }while (number%2 == 0);





    }
}