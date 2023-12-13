import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz : ");
        a = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        b = input.nextInt();
        System.out.print("Ucuncu sayiyi giriniz : ");
        c = input.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("Kucukten Buyuge Siralanisi :" + a + " < " + b + " < " + c);
            } else {
                System.out.println("Kucukten Buyuge Siralanisi :" + a + " < " + c + " < " + b);
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("Kucukten Buyuge Siralanisi :" + b + " < " + a + " < " + c);
            } else {
                System.out.println("Kucukten Buyuge Siralanisi :" + b + " < " + c + " < " + a);
            }
        }else{
            if(a < b){
                System.out.println("Kucukten Buyuge Siralanisi :" + c + " < " + a + " < " + b);
            }else{
                System.out.println("Kucukten Buyuge Siralanisi :" + c + " < " + b + " < " + a);
            }
        }
    }
}
