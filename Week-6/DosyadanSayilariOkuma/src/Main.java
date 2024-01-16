import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //Dosya yazdirma
        File file =new File("src/test.txt");
        FileWriter fWriter = new FileWriter(file);
        BufferedWriter bWriter = new BufferedWriter(fWriter);

        // Sayilari arr dizisinde tutup foreach ile dosyaya yazdir
        int[] arr = {5, 10, 20, 12, 33};

        for(int i : arr){
            bWriter.write(i + "\n");
        }
        bWriter.close();

        //Dosyayi okuma
        FileReader fReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);

        String line = bReader.readLine();
        int sum = 0;

        while(line != null){
            int number = Integer.parseInt(line);
            sum += number;
            line = bReader.readLine(); // Toplama islemi yapildiktan sonra sonraki satira gec
        }

        /*
        While ile diger cozum

        String line;
        while((line = bReader.readLine())!= null){
            int number = Integer.parseInt(line);
            sum += number;
        }*/

        System.out.println("Toplam : " + sum);
        bReader.close();
    }
}