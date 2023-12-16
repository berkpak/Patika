import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degisken tanimlama
        int number;

        //Kullanicidan alinan degerenin number degiskenine atanmasi
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        number = input.nextInt();

        //Girilen sayiya kadar 4'un kuvvetlerini hesaplama
        for (int i = 1; i <= number; i*=4){
            System.out.println("4'un kuvvetleri : "+i);
        }
        //Girilen sayiya kadar 5'in kuvvetlerini hesaplama
        for (int i = 1; i <= number; i*=5){
            System.out.println("5'in kuvvetleri : "+i);
        }
    }
}