public class Main {
    public static void main(String[] args) {

        int[] list = {1,2,3,4,5};
        double sum = 0;

        for (int i: list){
            sum += (1.0 / i);
        }
        double avarage = list.length / sum;
        System.out.println("Harmonik ortalamasi : " + avarage);
    }
}