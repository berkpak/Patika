import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degisken
        int basamakSayisi;

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayisini giriniz :");
        basamakSayisi = input.nextInt();

        //Girilen basamak sayisina gore olusturucalak yildiz ve bosluk sayisi
        for (int i = basamakSayisi; i >= 1; i--) {
            for (int bosluksayisi = basamakSayisi; bosluksayisi > i; bosluksayisi--) {
                System.out.print(" ");
            }for(int yildizSayisi = 1; yildizSayisi <(2 * i); yildizSayisi++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}