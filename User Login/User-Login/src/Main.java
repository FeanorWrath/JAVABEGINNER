import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password, relogpw, relogusername,repassword, non;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Username: ");
        userName = input.nextLine();

        System.out.println("Enter Your Password: ");
        password = input.nextLine();
        while (true) {

                System.out.println("Please Login for activation prosess");
                relogusername = input.nextLine();
                relogpw = input.nextLine();

                if (userName.equals(relogusername) && password.equals(relogpw)) {
                    System.out.print("Successfully Login");
                } else if (!Objects.equals(password, relogpw)) {
                    System.out.println("Do u want to make new password ? ");
                    System.out.println("Press Y for making new pasword if not Press N ");
                    non = input.nextLine();
                    if (non.equals("Y")) {
                        System.out.print("Enter New password : ");
                        repassword = input.nextLine();
                        System.out.println("You Have Successfully made new password");
                    }
                }

        }
    }
    }
