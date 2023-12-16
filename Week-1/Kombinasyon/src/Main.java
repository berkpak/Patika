import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler
        int n, r, nFaktoriyel = 1, rFaktoriyel = 1, fark = 1, kombinasyon;

        Scanner input = new Scanner(System.in);

        //Kombinasyon Formulu C(n,r) = n! / (r! * (n-r)!)
        System.out.print("n sayisini giriniz : ");
        n = input.nextInt();
        System.out.print("r sayisini giriniz : ");
        r = input.nextInt();

        //Kombinasyon Formulu C(n,r) = n! / (r! * (n-r)!)
        for (int i = 1; i <= n; i++) {
            nFaktoriyel *= i;              // nFaktoriyel = n * (n-1) * (n-2) ...
        }
        for (int i = 1; i <= r; i++) {     // rFaktoriyel = r * (r-1) * (r-2) ...
            rFaktoriyel *= i;
        }
        for(int i = 1; i <= (n-r); i++){   // fark = (n-r)
            fark *= i;
        }
        kombinasyon = nFaktoriyel / (rFaktoriyel * fark);
        System.out.println(n +" 'in " + r + " 'li kombinasyonu : " + kombinasyon);
    }
}