import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int matematik, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik Notunu Giriniz : ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunu Giriniz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunu Giriniz : ");
        kimya = input.nextInt();

        System.out.print("Turkce Notunu Giriniz : ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunu Giriniz : ");
        tarih = input.nextInt();

        System.out.print("Muzik Notunu Giriniz : ");
        muzik = input.nextInt();

        int ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Not Ortalamaniz : " + ortalama);
        String sonuc = ortalama > 60 ? "Gecti" : "Kaldi";
        System.out.println("Sonuc : " + sonuc);
    }
}