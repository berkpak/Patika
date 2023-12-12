import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut = 2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00, toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kac Kilo? : ");
        double armutkg = input.nextDouble();
        System.out.print("Elma Kac Kilo? : ");
        double elmakg = input.nextDouble();
        System.out.print("Domates Kac Kilo? : ");
        double domateskg = input.nextDouble();
        System.out.print("Muz Kac Kilo? : ");
        double muzkg = input.nextDouble();
        System.out.print("Patlican Kac Kilo? : ");
        double patlicankg = input.nextDouble();

        toplam += armut * armutkg;
        toplam += elma * elmakg;
        toplam += domates * domateskg;
        toplam += muz * muzkg;
        toplam += patlican * patlicankg;

        System.out.println("Toplam tutar : " + toplam);
    }
}