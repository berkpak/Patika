import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler
        int ay,gun;
        String burc = ""; /* bos bir burc degiskeni olusturduk asagida kosula bagli cikan
                             sonucun degeri burc degiskenine atanacak */

        Scanner input = new Scanner(System.in);

        //Kullanicidan input alip ay ve gun degiskenlerine atama
        System.out.print("Dogdugunuz ay'i giriniz (1-12): ");
        ay = input.nextInt();
        System.out.print("Dogdugunuz gunu giriniz (1-31): ");
        gun = input.nextInt();

        //Burclarin hangi ay ve gune denk geldigini belirten kosul ifadeleri
        if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20) ){
            burc = "Koc Burcu";
        }else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21) ){
            burc = "Boga Burcu";
        }else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22) ){
            burc = "Ikizler Burcu";
        }else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22) ){
            burc = "Yengec Burcu";
        }else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22) ){
            burc = "Aslan Burcu";
        }else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22) ){
            burc = "Basak Burcu";
        }else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22) ){
            burc = "Terazi Burcu";
        }else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21) ){
            burc = "Akrep Burcu";
        }else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21) ){
            burc = "Yay Burcu";
        }else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 21) ){
            burc = "Oglak Burcu";
        }else if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19) ){
            burc = "Kova Burcu";
        }else if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20) ){
            burc = "Boga Burcu";
        }else {
            System.out.println("Hatali tarih girildi");
        }
        //Sonuc
        System.out.println("Burcunuz: " + burc);
    }
}