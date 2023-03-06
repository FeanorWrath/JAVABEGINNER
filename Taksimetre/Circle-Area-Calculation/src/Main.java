import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        double pi = 3.14 , area , angle , r ;

        Scanner input = new Scanner(System.in);

        System.out.print("enter , radius of ur circle: ");
         r = input.nextDouble();
        System.out.print("enter , angle of ur piece: ");
        angle = input.nextDouble();

        area = (pi*(r*r)*angle)/360;


        System.out.println("AREA : "+area);






    }
}