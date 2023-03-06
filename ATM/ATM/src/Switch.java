import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3;
        int select;
        int balance = 2000;

        while (right > 0) {
            System.out.println("Enter Your Username: ");
            String id = input.nextLine();
            System.out.println("Enter Your Password: ");
            String pw = input.nextLine();
            if (id.equals("Emre") && pw.equals("1234")) {
                System.out.println("Welcome To Jahudi Bank!!");
                do {


                    System.out.println("Choose what action you want to do?\n" + "1-See Your Balance\n" + "2-Deposit\n" + "3-Withdraw\n" + "4-Quit");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println(balance);
                            break;
                        case 2:
                            System.out.println("Enter Balance that you want to deposit: ");
                            int deposit = input.nextInt();
                            balance += deposit;
                            break;
                        case 3:
                            System.out.println("Enter Balance that you want to withdraw: ");
                            int withdraw = input.nextInt();
                            if(withdraw > balance){
                                System.out.println("Your balance not enough Try again");
                            }
                            balance -= withdraw;
                            break;
                        case 4:
                            System.out.println("See You Again !! ");
                            break;
                    }
                } while (select != 4);
                break;


            } else {
                right--;
                System.out.println("You entered wrong ID and PW pls try again");
                if (right == 0) {
                    System.out.println("Your accout got block, pls call costumer serveces");
                    break;
                }
            }


        }


    }
}