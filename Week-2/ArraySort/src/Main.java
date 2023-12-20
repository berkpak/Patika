import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Dizinin eleman sayisini kullanicidan alma
        System.out.print("Dizinin eleman sayisi ");
        int n = input.nextInt();

        //Kullanicidan alinan n elemanli dizi olusturma
        int[] arr = new int[n];
        System.out.println("Dizinin elemanlarini giriniz : ");

        //Dizinin eleman sayisi kadar donen for donguss
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) +". Elemani : " ); // her bir elemani kullanicidan alma
            arr[i] = input.nextInt();                 // alinan degerleri arr[] dizisine atama
        }
        //Diziyi kucukten buyuge siralama
        Arrays.sort(arr);

        System.out.print("Siralama : ");
        //Foreach ile ekrana yazdirma
        for (int k : arr) System.out.print(k + " ");
    }
}