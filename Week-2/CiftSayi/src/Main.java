
public class Main {
    public static void main(String[] args) {

        int[] list = {1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10, 10};

        for (int i = 0; i < list.length; i++) {
            int repeatedNumber = list[i];

            if (repeatedNumber % 2 != 0) {
                continue;
            }
            boolean isRepeated = false;

            for (int j = 0; j < i; j++) {
                if (repeatedNumber == list[j] && repeatedNumber % 2 == 0) {
                    isRepeated = true;
                    break;
                }
            }
            if (isRepeated) {
                System.out.println("Tekrar eden cift sayilar :" + repeatedNumber);
            }
        }
    }
}