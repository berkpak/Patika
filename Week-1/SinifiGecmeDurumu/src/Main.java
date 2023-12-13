import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Degsikenleri tanimlayalim
        int mat, fizik, turkce, kimya, muzik, dersSayisi = 0, toplamNot = 0, sonuc;


        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        mat = input.nextInt();
        System.out.print("Fizik notunu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Turkce notunu giriniz : ");
        turkce = input.nextInt();
        System.out.print("Kimya notunu giriniz : ");
        kimya = input.nextInt();
        System.out.print("Muzik notunu giriniz : ");
        muzik = input.nextInt();

        if (mat >= 0 && mat <= 100) {
            dersSayisi++;
            toplamNot += mat;
        } else {
            System.out.println("Notunuz 0-100 arasinda olmalidir");
        }
        if (fizik >= 0 && fizik <= 100) {
            dersSayisi++;
            toplamNot += fizik;
        } else {
            System.out.println("Notunuz 0-100 arasinda olmalidir");
        }
        if (turkce >= 0 && turkce <= 100) {
            dersSayisi++;
            toplamNot += turkce;
        } else {
            System.out.println("Notunuz 0-100 arasinda olmalidir");
        }
        if (kimya >= 0 && kimya <= 100) {
            dersSayisi++;
            toplamNot += kimya;
        } else {
            System.out.println("Notunuz 0-100 arasinda olmalidir");
        }
        if (muzik >= 0 && muzik <= 100) {
            dersSayisi++;
            toplamNot += muzik;
        } else {
            System.out.println("Notunuz 0-100 arasinda olmalidir");
        }
        sonuc = (toplamNot / dersSayisi);
        if (sonuc >= 55) {
            System.out.println("Ortalamaniz " + sonuc +" Gectiniz");
        } else System.out.println("Ortalamaniz " + sonuc +" Kaldiniz");
    }
}