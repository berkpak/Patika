import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz :");
        number = input.nextInt();

        /*Sayinin 10 a bolumden kalani (birler basamagi) total degiskenine
         ekleyip kalan sayi ile dongu devam ediyor*/
        while(number > 0){
            total += number % 10;
            number /= 10;
        }
        System.out.println("Basamak sayilari toplami : "+total);
    }
}