import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();
        boolean isLeapyear = false;

        if (year %4 == 0) {
            if(year%100 == 0 ) {
                if (year%400 == 0){
                    isLeapyear = true;
                }
            }else
                isLeapyear = true ;
        }
        if (isLeapyear){
            System.out.print(year +" It's a leap year");
        }else
            System.out.print(year +" It's not a leap year");
    }
}