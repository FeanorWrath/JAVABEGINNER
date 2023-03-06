import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1 , n2 , select;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        n1 = input.nextInt();
        System.out.print("Enter Any Number : ");
        n2 = input.nextInt();

        System.out.println("1-Addition \n2-Substraction \n3-Multiplication \n4-Divide ");
        System.out.print("Choose operation that you want to do  ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.print(n1+n2);
                break;
            case 2:
                System.out.print(n1-n2);
                break;
            case 3:
                System.out.print(n1*n2);
            case 4:
                if (n2 == 0) {
                    System.out.print("Eror : Undefined Operation");
                } else {
                    System.out.print(n1 / n2);
                }
                break;
            default:
                System.out.print("You have selected wrong operation , Please Select operation between 1 and 4  ");
        }

    }
}