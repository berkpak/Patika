import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner input = new Scanner(System.in);
        System.out.print("Indeks degerini giriniz :");
        int getInput = input.nextInt();

        try{
            // Hataya sebep olabiliecek durumlari dene
            int getIndex = arrIndex(arr,getInput);
            System.out.println(getIndex);
        // Yakalanan hatanin ozel mesajini ekrana yazdir.
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            input.close();
        }
    }
    //Indeksteki elemani donduren metot
    public static int arrIndex(int[] arr, int i) throws Exception{
        //Eger dizinin boyutu disinda bir deger girilirse hatayi firlat
        if(i < 0 || i >= arr.length){
            throw new Exception("Dizinin boyutu disinda bir deger girdiniz !");
        }else{
            return arr[i];
        }
    }
}