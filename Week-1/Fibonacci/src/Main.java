import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler
        int input, n1=0, n2=1 , total;

        Scanner getInput = new Scanner(System.in);
        System.out.print("Eleman sayisini giriniz : ");
        input = getInput.nextInt();


        for (int i = 0; i <= input; i++){
            System.out.print(n1 + " ");

            /* Fibonacci
            0 1 1 2 3 5 8 13 21
            a b c
              a b c          a = n1 , b = n2 , c = total
                a b c
            */
            total = n1 + n2;
            n1 = n2;
            n2 = total;
        }
    }
}