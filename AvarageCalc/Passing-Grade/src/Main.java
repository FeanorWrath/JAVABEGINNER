import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int math , phy , english , music , history ;
        double totalpoint = 0 , totallessons = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your mark of the Mathematics:");
        math = input.nextInt();
        if (math>=0 && 100>=math){
            totalpoint += math;
            totallessons ++ ;
        }

        System.out.print("Enter your mark of the Physics:");
        phy = input.nextInt();
        if (phy>=0 && 100>=phy){
            totalpoint += phy;
            totallessons ++ ;
        }
        System.out.print("Enter your mark of the English:");
        english = input.nextInt();
        if (english>=0 && 100>=english){
            totalpoint += english;
            totallessons ++ ;
        }


        System.out.print("Enter your mark of the Music:");
        music = input.nextInt();
        if (music>=0 && 100>=music){
            totalpoint += music;
            totallessons ++ ;
        }

        System.out.print("Enter your mark of the History:");
        history = input.nextInt();
        if (history>=0 && 100>=history){
            totalpoint += history;
            totallessons ++ ;
        }

        double avarage = totalpoint/totallessons;
        if (avarage >= 55){
            System.out.println("Gz you passed the class!");
            System.out.println("Your Point is : "+avarage);
        }else {
            System.out.println("Cya next year :(");
            System.out.print("Your Point is : "+avarage);
        }




    }
}