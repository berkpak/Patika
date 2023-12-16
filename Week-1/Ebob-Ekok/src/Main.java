import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler
        int n1, n2;

        Scanner input = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz : ");
        n1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        n2 = input.nextInt();

        int ebob = 1, i = 1, ekok;

        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        ekok = (n1 * n2) / ebob;
        System.out.println("Ebob : " + ebob);
        System.out.println("Ekok : " + ekok);
    }

}