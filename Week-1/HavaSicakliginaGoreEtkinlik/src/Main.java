import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskeni tanimladik
        int heat;

        //Kullanicidan alinan degeri heat degiskenine atadik
        Scanner input = new Scanner(System.in);
        System.out.print("Sicaklik Giriniz : ");
        heat = input.nextInt();

        //Sicaklik degerine gore onerilecek aktiviteleri belirledik
        if (heat < 5){
            System.out.println("Kayak Yapabilirsiniz");
        }else if (heat > 5 && heat <= 15){
            System.out.println("Sinemaya Gidebilirisiniz");
        }else if (heat > 15 && heat <= 25) {
            System.out.println("Piknige Gidebilirisiniz");
        }else{
            System.out.println("Yuzmeye Gidebilirisiniz");
        }
    }
}