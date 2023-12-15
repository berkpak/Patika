public class Main {
    public static void main(String[] args) {

        //2 den baslayip 100 e kadar
        for (int i = 2; i <= 100; i++) {
            boolean asal = true;

            //2 den baslayip i sayisina kadar olan sayilari i ye boluyor
            for (int n = 2; n < i; n++) {
                if (i % n == 0) { // i sayisi kendisinde kucuk bir degere bolunuyorsa asal degil donguden cik
                    asal = false;
                    break;
                }
            }
            // i sayisi asalsa ekrana yazdir
            if (asal) {
                System.out.println(i);
            }
        }
    }
}