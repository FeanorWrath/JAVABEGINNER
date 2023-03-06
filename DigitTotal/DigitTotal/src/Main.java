import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int basPow;
        int result=0;


       while(tempNumber != 0 ){
           tempNumber /=10;
           basNumber++;
       }

       tempNumber = number;
       while(tempNumber != 0 ){
           basPow = tempNumber %10;

           basValue=1;
           for(int i = 1;i<=basNumber;i++){
               basValue *= basPow;

           }
           result += basValue;
           tempNumber /=10;

       }
       if(result==number){
           System.out.print(result+"it's equal to"+number+"and it's a armstrong number");
       }else
           System.out.print(result+" it's not equal to "+number+" and it's not a armstrong number");


    }
}