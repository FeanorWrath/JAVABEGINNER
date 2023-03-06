import   java.util.Scanner;
public class Evennumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        System.out.print("Enter any number : ");
        int number = input.nextInt();

     for(int i = 0 ; i < number ; i++ ){
         if(i%2==0){
             System.out.println(i);
         }
     }
        /*int i = 0;
        while (i < number) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }*/

        /* int i = 0;
        do{
            i++;
            if(i%2==0)
                System.out.println(i);
        }while(i<number);*/


    }
}
