import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degsikenler
        int getInput, getNumber, min, max;

        //Kullanicidan alinan veriyi getInput degiskenine atadik
        Scanner input = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz :");
        getInput = input.nextInt();

        /* Integerin max ve min degerlerini degiskene atadik.
        Burada min degiskenine MAX_VALUE atamamin sebebi girilen int degeri MAX_VAlUE dan buyuk olamayacagi icin
        ilk if kosulunda girilen degeri min degiskekine atamak.*/
        min = Integer.MAX_VALUE; //Max deger (2147483647)
        max = Integer.MIN_VALUE; //Min deger (–2147483648)

        //Kac tane sayi gireceksiniz sorusuna girilen degere kadar islem yapilacak seklinde for dongusunu olusturduk.
        for (int i = 1; i <=getInput; i++){
            System.out.print(i +". Sayiyi Giriniz : ");
            getNumber = input.nextInt();

            /*(Girilen sayi < min = MAX_VALUE) bu kosulda int degeri girildigi surece her zaman true donucek ve
            girilen sayiyi min degiskenine atayacak ayni islem max degiskeni icinde gecerli*/
            if(getNumber < min){
                min = getNumber;
            }
            if (getNumber > max){
                max = getNumber;
            }
        }
        System.out.println("En buyuk sayi : " + max);
        System.out.println("En kucuk sayi : " + min);
    }
}