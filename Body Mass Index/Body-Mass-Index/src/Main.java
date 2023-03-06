import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double weight , height , mIndex;

         Scanner input = new Scanner(System.in);
        System.out.print("Please , enter your height : ");
            height = input.nextDouble();
        System.out.print("Please , enter your weight : ");
         weight = input.nextDouble();

         mIndex = weight/(height*height);
        System.out.println("Your Body Mass Index is "+mIndex);
    }
}