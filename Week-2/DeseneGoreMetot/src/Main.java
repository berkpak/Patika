import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degisken
        int number;
        //Kullanicidan bir sayi al
        Scanner input = new Scanner(System.in);
        System.out.print("N sayisi : ");
        number = input.nextInt();

        //metodu cagir
        result(number);
    }

    static void result(int number) {
        System.out.print(number + " ");

        if (number <= 0) {
            return;
        }
        result(number - 5);
        System.out.print(number + " ");
    }
}