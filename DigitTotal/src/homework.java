import java.util.Scanner;
public class homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = input.nextInt();

        int basValue=0;
        int counter = 0;

        while(number != 0){
            basValue += number%10;
            counter++;
            number /=10;
        }
        System.out.println(basValue);
    }
}