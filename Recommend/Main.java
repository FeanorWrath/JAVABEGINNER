
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("how is weather ? if it's rainy press Y if not press N ");
        String weather = scanner.nextLine();

        System.out.print("what is temp ?  ");
        int temp = scanner.nextInt();


        if (weather.equals("Y")) {
            System.out.println("Stay at home mate");
        } else if (weather.equals("N")) {
            if (temp <= 5 && temp >= -30) {
                System.out.print("you can go to ski");
            } else if (temp < -30) {
                System.out.print("stay at home , where do u live ? in south-pole or something dude ");
            } else if (temp < 25) {
                System.out.println("You can go a cafe ");
                if (temp > 10) {
                    System.out.print("you can go for a walk");
                }
            }

        }
    }
}