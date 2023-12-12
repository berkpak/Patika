import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yari capini giriniz : ");
        r = input.nextInt();

        double alan = pi * r * r;
        double cevre = pi * r * 2;

        System.out.println("Dairenin Alani : " + alan);
        System.out.println("Dairenin Cevresi : " + cevre);
    }
}