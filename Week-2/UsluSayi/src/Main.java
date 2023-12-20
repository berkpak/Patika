import java.util.Scanner;

public class Main {

    static int calc(int base, int power) {
        if (power == 0) {
            return 1;
        } else {
            return base * calc(base, power - 1);
        }
    }

    public static void main(String[] args) {

        //Degsikenler
        int base, power, result;

        Scanner input = new Scanner(System.in);

        System.out.print("Taban Degerini Giriniz : ");
        base = input.nextInt();
        System.out.print("Us degerini giriniz : ");
        power = input.nextInt();

        result = calc(base, power);
        System.out.print("Sonuc : " + result);
    }
}