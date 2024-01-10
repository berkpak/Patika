import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String getInput = input.nextLine();

        //Metni kelimelere ayir
        String[] arr = getInput.split(" ");

        //Kelimeleri saymak icin HashMap veri yapisi (key=kelime,value=sayisi)
        HashMap<String, Integer> repeatedWord = new HashMap<>();

        /*Kelimeleri döngüyle tek tek dolaşıp her birini `HashMap`'e ekleyin. Eğer kelime `HashMap`'de zaten varsa
        count'u bir artırın. Eğer yoksa, kelimeyi `HashMap`'e ekleyip count'u 1 olarak belirleyin.*/
        for(String i : arr){
            if(repeatedWord.containsKey(i)){
                repeatedWord.put(i,repeatedWord.get(i) + 1);
            }else{
                repeatedWord.put(i,1);
            }
        }
        //System.out.println(repeatedWord);

        //HashMap`'i dolaşıp en yüksek count değerine sahip kelimeyi bulun.
        int countWord = 0;
        String rWord = "";
        for(String k : repeatedWord.keySet()){
            if(repeatedWord.get(k) > countWord){
                countWord = repeatedWord.get(k);
                rWord = k;
            }
        }
        System.out.println("Girdiginiz metinde En cok tekrar eden kelime " + countWord  + " tekrar ile " + rWord);
    }
}