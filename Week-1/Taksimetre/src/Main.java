import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km;
        double kmUcreti = 2.20, toplam= 10;

        Scanner input =  new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz : ");
        km = input.nextInt();

        toplam += km * kmUcreti;
        toplam = (toplam < 20) ? 20 : toplam;
        System.out.println("Toplam tutar : "+toplam);
    }
}