import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenleri Tanimlama
        int getNumber, total = 0, counter = 0;

        //Kullanicidan alinan sayiyi getNumber degiskenine atama
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        getNumber = input.nextInt();

        /*0 ile girilen deger arasindaki sayilarin 3 ve 4 un kati
        olma durumunun kontrol edilip total ve counter degiskenlerine eklenmesi */
        for (int i = 1; i <= getNumber; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                total += i;
                counter++;
                System.out.println("3 ve 4 un kati olan sayilar :" + i);
            }
        }
        int result = (total / counter);
        System.out.println("O ile " + getNumber + " arasindaki sayilardan 3 ve 4 un kati olanlarin ortalamasi :" + result);
    }
}
