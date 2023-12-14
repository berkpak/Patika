import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //degiskenler
        int km, age, tripType = 1;

        //Kullanicidan alinan verinin ilgili degiskene atanmasi
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz : ");
        km = input.nextInt();
        System.out.print("Yasinizi giriniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk tipi : (1 => Tek yon , 2 => Gidis Donus) : ");
        tripType = input.nextInt();


        if ((km > 0) && (age > 0) && (tripType == 1 || tripType == 2)) {
          double  total = km * 0.1; // Bilet fiyati
          double discount = 0;

          // yas durumlarina gore indirim tutarlari
            if (age < 12) {
                discount = 0.5;
            } else if (age >= 12 && age <= 24) {
                discount = 0.1;
            } else if (age > 65) {
                discount = 0.3;
            }
            total -= total * discount;

            // Gidis Donus secilmesi durumunda bu kosul uygulanacak
            if(tripType == 2){
                total -= total * 0.2;
                total *= 2; // gidis donus 2 bilet oldugu icin 2 ile carp
            }
            System.out.println("Toplam Fiyat : " + total);
        }
        else {
            System.out.println("Hatali Giris yaptiniz");
        }
    }
}