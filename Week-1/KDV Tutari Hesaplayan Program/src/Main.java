import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdvOrani = 0.18, kdvFiyati, toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Tutari giriniz : ");
        tutar = input.nextDouble();

        kdvFiyati = tutar * kdvOrani;
        toplam = tutar + kdvFiyati;

        System.out.println("KDV'siz Fiyati : " + tutar);
        System.out.println("KDV Orani : " + kdvOrani);
        System.out.println("KDV Tutari : " + kdvFiyati);
        System.out.println("Toplam Fiyati : " + toplam);
    }
}