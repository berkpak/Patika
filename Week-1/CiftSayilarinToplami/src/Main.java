import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Degsikenler
        int number, total = 0;

        /*Girilen sayinin cift ve 4 un kati olma durumunu kontrol
         edip total degiskenine ekliyoruz*/
        do {
            System.out.print("Sayi giriniz : ");
            number = input.nextInt();
            if ((number % 2 == 0) && (number % 4 == 0)) {
                total += number;
            }
            //Tek bir sayi girene kadar dongu devam edecek
        } while (number % 2 == 0);

        System.out.println("Toplam : " + total);
    }
}