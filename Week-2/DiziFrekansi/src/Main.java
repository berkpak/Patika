public class Main {
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        for (int i = 0; i < list.length; i++) {
            int counter = 0;

            boolean isCounted = false;

            for (int j = 0; j < i; j++) {
                if (list[i] == list[j]) {
                    isCounted = true;
                    break;
                }
            }
            if(!isCounted){
                for(int j = i; j < list.length; j++){
                    if (list[i] == list[j]){
                        counter++;
                    }
                }
                System.out.println(list[i] + " sayisi " + counter + " kere tekrar edildi.");
            }
        }
    }
}