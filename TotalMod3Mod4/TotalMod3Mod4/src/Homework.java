import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0 ;
        int k = 0;

        System.out.print("Enter any number : ");
        int number = input.nextInt();

        for(int i = 0 ; i < number ; i++ ){
            if(i %3 == 0  && i % 4 == 0){
               total += i ;
                k++;
            }
        }
        System.out.println("total : "+total);
        System.out.println("average: "+(total/k));



    }
}