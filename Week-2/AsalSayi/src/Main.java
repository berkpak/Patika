import java.util.Scanner;


public class Main {
    static boolean prime(int number) {

        //1 ve negatif deger kontrolu
        if (number <= 1) {
            return false;
        }
        //Asal olma durumu kontrolu
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        //Kendisi haric baska bir sayiya bolunmuyorsa true donecek
        return true;
    }

    public static void main(String[] args) {

        //Degsiken
        int number;

        //Kullanicidan alinan sayi degeri number degiskenine ataniyor
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        number = input.nextInt();

        //metotu cagirma ve sonucuna gore ekrana yazdirma
        if (prime(number)) {
            System.out.println(number + " ASALDIR");
        } else {
            System.out.println(number + " ASAL sayi degildir !");
        }
    }
}