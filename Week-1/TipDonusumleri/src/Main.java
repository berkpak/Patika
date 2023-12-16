import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Kullanicidan veri alma ve bu veriyi n1 n2 degiskenlerine atama
        Scanner input = new Scanner(System.in);
        System.out.print("Bir tam sayi giriniz : ");
        int n1 = input.nextInt();
        System.out.print("Bir ondalikli sayi giriniz : ");
        double n2 = input.nextDouble();

        double newDouble = n1; // n1 degerini double a donusumu
        int newInt = (int) n2; // n2 degerinin int donusumu

        System.out.println(newDouble);
        System.out.println(newInt);
    }
}