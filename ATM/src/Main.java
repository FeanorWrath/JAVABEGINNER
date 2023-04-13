import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3;
        int select;
        int balance = 2000;





        while(right > 0) {
            System.out.print("Enter Your Username: ");
            String ID = input.nextLine();
            System.out.print("Enter Your Password: ");
            String password = input.nextLine();

            if (ID.equals("Emre") && password.equals("1234")) {
                System.out.println("Giriş Yaptınız!");

                do {
                    System.out.println("""
                            1-Bakiye Sorgula
                            2-Para Yatırma
                            3-Para Çekme
                            4-Çıkış Yap
                            """);
                    System.out.print("İşleminizi Seçiniz : ");
                    select = input.nextInt();
                    if(select==1){
                        System.out.println("Bakiyeniz: "+balance);
                    } else if (select == 2) {
                        System.out.println("Yatırmak İstediğiniz Miktarı Yazınız: ");
                        int deposit = input.nextInt();
                        balance += deposit;
                    } else if (select == 3) {
                        System.out.println("Çekmek İstediğiniz Miktarı Yazınız: ");
                        int withDraw = input.nextInt();
                        if(balance >= withDraw){
                            balance -= withDraw;
                        }else{
                            System.out.println("Bakiyeniz Yetersiz!");
                        }
                    }
                } while (select != 4);
                    System.out.println("Görüşmek Üzere!");
                    break;

            }else {
                right--;
                System.out.println("Hatalı Giriş Yaptınız Tekrar Deneyiniz");
            }
            if (right == 0){
                System.out.println("Hesabınız Bloke Edilmiştir , Müşteri Hizmetlerine Başvurunuz");
            }else
                System.out.println("Kalan Hakkınız:"+right);
        }


    }
}