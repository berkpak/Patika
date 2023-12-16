import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int basamakSayisi;

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayisini giriniz :");
        basamakSayisi = input.nextInt();

        for (int i = 1; i <= basamakSayisi; i++) {
            for (int boslukSayisi = 1; boslukSayisi <= (basamakSayisi - i); boslukSayisi++) {
                System.out.print(" ");
            }
            for (int yildizSayisi = 1; yildizSayisi <= (2 * i) - 1; yildizSayisi++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = basamakSayisi - 1; i >= 1; i--) {
            for (int bosluksayisi = basamakSayisi; bosluksayisi > i; bosluksayisi--) {
                System.out.print(" ");
            }for(int yildizSayisi = 1; yildizSayisi <(2 * i); yildizSayisi++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}