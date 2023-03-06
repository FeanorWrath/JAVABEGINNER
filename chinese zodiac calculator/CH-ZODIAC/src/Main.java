import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String zodiac = " ";
        int bd,mod;

        System.out.print("Enter the year of your birtday: ");
        bd = input.nextInt();

        mod = bd % 12;

        switch (mod){

            case 0 -> zodiac = "MONKEY";
            case 1 -> zodiac = "Rooster";
            case 2 -> zodiac = "DOG";
            case 3 -> zodiac = "PIG";
            case 4 -> zodiac = "MOUSE";
            case 5 -> zodiac = "OX";
            case 6 -> zodiac = "TIGER";
            case 7 -> zodiac = "RABBIT";
            case 8 -> zodiac = "DRAGON";
            case 9 -> zodiac = "SNAKE";
            case 10 -> zodiac = "HORSE";
            case 11 -> zodiac = "SHEEP";
        }
        System.out.print("Your chinese zodiac sign is " + zodiac);

    }
}