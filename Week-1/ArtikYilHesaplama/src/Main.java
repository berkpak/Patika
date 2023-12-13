import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degisken tanimlama
        int year;

        //Kullanicidan yil bilgisini alip year degiskenine atama
        Scanner input = new Scanner(System.in);
        System.out.print("Yil Giriniz : ");
        year = input.nextInt();

        if ((year % 100 != 0) && (year % 4 ==0)){
            System.out.println(year + " Bir artik yildir");
        }else if (year % 400 ==0){
            System.out.println(year + " Bir artik yildir");
        }else {
            System.out.println(year + " Artik Yil Degildir");
        }
    }
}