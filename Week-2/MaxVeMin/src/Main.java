import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int getNumber;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        getNumber = input.nextInt();

        int[] list = {56,34,1,8,101,-2,-33};

        int smallerNumber = Integer.MAX_VALUE;
        int largerNumber = Integer.MIN_VALUE;

        for(int i: list){
            if (i < getNumber && i > largerNumber){
                largerNumber = i;
            }
            if(i > getNumber && i < smallerNumber){
                smallerNumber = i;
            }
        }
        System.out.println("Girilen sayi : " +getNumber);
        System.out.println("Girilen sayidan kucuk en yakin sayi : "+ largerNumber);
        System.out.println("Girilen sayidan buyuk en yakin sayi : "+ smallerNumber);
    }
}