import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //0-100 arasinda rastgele bir ssay uret
        int number = (int) (Math.random() * 100); // TypeCasting (double --> int)

        System.out.println(number);

        Scanner input = new Scanner(System.in);

        int right = 0;
        int selected;

        while (right < 5){
            System.out.print("Tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99){
                System.out.println("0-100 arasinda bir sayi giriniz.");
                continue;
            }
            if(selected == number){
                System.out.println("Tebrikler dogru sayiyi tahmin ettiniz ! Gizli sayi : "+ number);
                break;
            }else {
                right++;
                System.out.println("Hatali sayi girdiniz");
                if(selected > number){
                    System.out.println(selected + " Sayisi gizli sayidan buyuktur");
                } else{
                    System.out.println(selected + " Sayisi gizli sayidan kucuktur");
                }
                System.out.println("Kalan hak : " + (5 - right));
            }
        }
    }
}