import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String word, reverseWord = "";

        System.out.print("Kelime giriniz : ");
        word = input.nextLine();

        for (int i = word.length()-1; i >= 0 ; i--) {
            reverseWord += word.charAt(i);
        }
        if(reverseWord.equals(word)){
            System.out.println(word + " Palindrom kelimedir");
        }else {
            System.out.println(word + " Palindrom kelime degildir");
        }
    }
}