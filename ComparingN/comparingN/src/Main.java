import   java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter Anynumber: ");
        int a = input.nextInt();

        System.out.print("Enter Anynumber: ");
        int b = input.nextInt();

        System.out.print("Enter Anynumber: ");
        int c = input.nextInt();

        if(a<b && a<c){
            if(b<c){
                System.out.print("a<b<c");
            }else {
                System.out.print("a<c<b");
            }
        } else if (b<a && b<c) {
            if(a<c){
                System.out.print("b<a<c");
            }else {
                System.out.print("b<c<a");
            }
        }else {
            if (a<b){
                System.out.print("c<a<b");
            }else {
                System.out.println("c<b<a");
            }
        }
    }
}