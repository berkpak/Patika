import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenleri tanimlayalim
        int n1, n2, calc;

        Scanner input = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz : ");
        n1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n 2-Cikarma\n 3-Carpma\n 4-Bolme");
        System.out.print("Yapmak istediginiz islemi seciniz (1-4) : ");
        calc = input.nextInt();

        switch (calc) {
            case 1:
                System.out.println("Toplama Islemi Sonucu : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma Islemi Sonucu: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma Islemi Sonucu : " + (n1 * n2));
                break;
            case 4:
                System.out.println("Bolme Islemi Sonucu : " + (n1 / n2));
                break;
            default:
                System.out.println("Yanlis secim yaptiniz");
        }
    }
}