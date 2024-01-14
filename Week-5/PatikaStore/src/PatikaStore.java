import java.util.Scanner;

public class PatikaStore {

    Scanner scanner = new Scanner(System.in);
    boolean isRunning = true;

    public void run(){
        while(isRunning){
            System.out.println("Patika Store Yonetim Paneli");
            System.out.println("1- Notebook Islemleri \n" +
                    "2- Cep Telefonu Islemleri \n"+
                    "3- Markalari Listeleme \n"+
                    "0- Cikis Yap");
            System.out.print("Yapmak istediginiz islemi seciniz :");

            int selection = scanner.nextInt();
            switch (selection){
                case 1:
                    Notebook notebook = new Notebook();
                    notebook.runMenu();
                    break;
                case 2:
                    Phone phone = new Phone();
                    phone.runMenu();
                    break;
                case 3:
                    Brand brand = new Brand();
                    brand.printBrand();
                    break;
                case 0:
                    System.out.println("Cikis Yapildi");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Hatali bir deger girdiniz.");
            }
        }
    }
}