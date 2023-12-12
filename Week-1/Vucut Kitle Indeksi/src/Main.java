import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int weight;
        double height, bmi;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        height = input.nextDouble();

        System.out.print("Kilonuzu giriniz : ");
        weight = input.nextInt();

        bmi = weight / (height * height);
        System.out.println("Vucut Kitle Indeksiniz : " + bmi);
    }
}