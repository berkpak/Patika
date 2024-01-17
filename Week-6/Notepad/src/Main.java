import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //Kullanicidan metin girisi al
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz :");
        String text = input.nextLine();

        //Dosya olustur
        File file = new File("src/test.txt");

        //Kullanicidan alinan metni dosyaya yazdirma
        FileWriter fWriter = new FileWriter(file);
        PrintWriter pWriter = new PrintWriter(fWriter);
        pWriter.print(text);
        pWriter.close();

        //Dosyadan metin okuma
        FileReader fReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);
        String inputText = bReader.readLine();
        bReader.close();

        System.out.println(inputText);
    }
}