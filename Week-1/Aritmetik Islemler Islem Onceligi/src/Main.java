import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c, sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz : ");
        a = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        b = input.nextInt();
        System.out.print("Ucuncu sayiyi giriniz : ");
        c = input.nextInt();

        sonuc = a + (b * c) - b;
        System.out.println("Sonuc : " + sonuc);
    }
}