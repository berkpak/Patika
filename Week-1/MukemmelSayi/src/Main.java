import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degsikenler
        int getInput, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        getInput = input.nextInt();

        /*Alinan sayinin kendisine kadar donen ve bu sayilardan kalansiz bolunleleri
        total degiskenine atayan for dongusunu olusturduk*/
        for (int i = 1; i < getInput; i++) {
            if (getInput % i == 0) {
                total += i;
            }
        }
        //Kalansiz bolunen sayilarin toplami girilen sayiya esitse ekrana yazdir
        if (total == getInput) {
            System.out.println(getInput + " Mukemmel sayidir");
        } else {
            System.out.println(getInput + " Mukemmel sayi degildir");
        }
    }
}