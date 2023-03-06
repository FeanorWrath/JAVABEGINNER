import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String zodiac = "";

        boolean isEror = false;

        System.out.print("Enter the month you were born: ");
        int month = input.nextInt();

        System.out.print("Enter the day you were born: ");
        int day = input.nextInt();

        if(month == 1){
            if(day>=1 && day<=31){
                if (day<=21) {
                    zodiac = "Capricorn";
                }else {
                    zodiac = "Aquarius";
                }
            }else {
                isEror = true;
            }
        }
        else if(month == 2){
            if(day>=1 && day<=31){
                if (day<=21) {
                    zodiac = "Capricorn";
                }else {
                    zodiac = "Aquarius";
                }
            }else {
                isEror = true;
            }
        }
        else if(month == 3 ) {
             if (day >= 1 && day <= 31) {
                 if (day <= 20) {
                     zodiac = "Pisces";
                 } else {
                     zodiac = "Aries";
                 }
             } else {
                 isEror = true;
             }
         }
        else if(month == 4 ){
            if(day>=1 && day<=30) {
                if (day <= 20) {
                    zodiac = "Aries";
                } else {
                    zodiac = "Taurus";
                }
            }else{
                isEror = true;
            }
        }

        else if(month == 5 ){
            if(day>=1 && day<=31){
               if (day<=21) {
                   zodiac = "Taurus";
               }else {
                   zodiac = "Gemini";
               }
            }else {
                isEror = true;
            }
        }
        else if(month == 6 ){
            if(day>=1 && day<=30){
                if(day<=22) {
                    zodiac = "Gemini";
                }else {
                    zodiac = "Cancer";
                }
            }else  {
                isEror = true;
            }
        }
        else if(month == 7 ){
            if(day>=1 && day<=31){
               if (day<=22){
                   zodiac = "Cancer";
               }else {
                   zodiac = "Leo";
               }
            }else {
                isEror = true;
            }
        }
        else if(month == 8 ){
            if(day>=1 && day<=31){
               if (day<=22){
                   zodiac = "Leo";
               }else {
                   zodiac = "Virgo";
               }
            }else {
                isEror = true;
            }
        }
        else if(month == 9 ){
            if(day>=1 && day<=30){
               if (day<=22){
                   zodiac = "Virgo";
               }else {
                   zodiac = "Libra";
               }
            }else {
                isEror = true;
            }
        }
        else if(month == 10 ){
            if(day>=1 && day<=31){
               if (day<=22){
                   zodiac = "Libra";
               }else {
                   zodiac = "Scorpion";
               }
            }else {
                isEror = true;
            }
        }
        else if(month == 11 ){
            if(day>=1 && day<=30){
               if (day<=21){
                   zodiac = "Scorpian";
               }else {
                   zodiac = "Sagittarius";
               }
            }else {
                isEror = true;
            }
        }
        else if(month == 12 ){
            if(day>=1 && day<=31){
               if (day<=21){
                   zodiac = "Sagittarius";
               }else {
                   zodiac = "Capricorn";
               }
            }else {
                isEror = true;
            }
        }
        if (month>12){
            isEror = true;
        }

        if(isEror){
            System.out.print("You have entered wrong ");
        }else {
            System.out.print("Your Zodiac: " + zodiac);
        }
    }
}
