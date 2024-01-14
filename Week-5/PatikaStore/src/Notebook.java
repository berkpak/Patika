import java.util.ArrayList;
import java.util.Scanner;

public class Notebook extends Product implements IOperation {

    private static ArrayList<Notebook> notebookList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Notebook(int id, String name, double price, double discountRate, int stock, String brandName, String screenSize, int ram, String memory) {
        super(id, name, price, discountRate, stock, brandName, screenSize, ram, memory);
    }

    public Notebook() {
    }

    static {
        notebookList.add(new Notebook(1, "Huawei Matebook 14", 7000, 0.10, 10, "Huawei", "14.0", 16, "512"));
        notebookList.add(new Notebook(2, "Lenovo V14 IGL", 3699, 0.10, 10, "Lenovo", "14.0", 8, "1024"));
    }

    @Override
    public void runMenu() {
        boolean isRunning = true;
        do{
            System.out.println("Notebook Yonetim Paneli");
            System.out.println("--------------------------");
            System.out.println("1- Notebook Listeleme \n" +
                    "2- Notebook Ekleme \n" +
                    "3- Notebook Silme \n" +
                    "4- Id ye gore Listeleme \n" +
                    "5- Markaya ye gore Listeleme \n" +
                    "0- Cikis Yap");
            System.out.print("Yapmak istediginiz islemi seciniz :");

            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    showProductList();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    filterByProductId();
                    break;
                case 5:
                    filterByProductBrand();
                    break;
                case 0:
                    System.out.println("Menuden cikis Yap");
                    isRunning = false;
                    break;
            }
        }while(isRunning);
    }

    @Override
    public void showProductList() {
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.printf("| %-5s | %-25s | %-10s | %-10s | %-9s | %-8s | %-10s |\n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
        System.out.println("---------------------------------------------------------------------------------------------------");

        for (Notebook notebook : notebookList) {
            System.out.printf("| %-5d | %-25s | %-7.1f TL | %-10s | %-9s | %-8s | %-10d |\n",
                    notebook.getId(), notebook.getName(), notebook.getPrice(), notebook.getBrandName(),
                    notebook.getMemory(), notebook.getScreenSize(), notebook.getRam());
        }
        System.out.println("---------------------------------------------------------------------------------------------------");
    }

    @Override
    public void addProduct() {
        System.out.print("ID degeri giriniz :");
        int newID = scanner.nextInt();
        System.out.print("Urun adi giriniz :");
        String newName = scanner.next();
        System.out.print("Fiyati giriniz :");
        int newPrice = scanner.nextInt();
        System.out.print("Indirim oranini giriniz :");
        int newDiscount = scanner.nextInt();
        System.out.print("Stock miktarini giriniz :");
        int newStock = scanner.nextInt();
        System.out.print("Marka adini giriniz :");
        String newBrand = scanner.next();
        System.out.print("Depolama degerini giriniz :");
        String newMemory = scanner.next();
        System.out.print("Ekran boyutunu giriniz :");
        String newScreenSize = scanner.next();
        System.out.print("Ram degerini giriniz :");
        int newRam = scanner.nextInt();

        notebookList.add(new Notebook(newID, newName, newPrice, newDiscount, newStock, newBrand, newScreenSize, newRam, newMemory));
        System.out.println("Urun eklendi.");
    }

    @Override
    public void deleteProduct() {
        showProductList();
        System.out.println("Silmek istediginiz urunun ID numarasini giriniz :");
        int selectedID = scanner.nextInt();

        Notebook notebookDelete = idNumber(selectedID);

        if (notebookDelete == null) {
            System.out.println("ID bulunamadi");
        } else {
            notebookList.remove(notebookDelete);
            System.out.println("Urun Kaldirildi.");
        }
        System.out.println();
        System.out.println("Guncel notebook listesi");
        showProductList();
    }

    @Override
    public void filterByProductId() {
        showProductList();
        System.out.println("Filtrelemek istediğiniz ürünün ID numarasını giriniz:");
        int searchId = scanner.nextInt();

        for (Notebook filteredNotebook : notebookList) {
            if (filteredNotebook.getId() == searchId) {
                System.out.println("---------------------------------------------------------------------------------------------------");
                System.out.printf("| %-5s | %-25s | %-10s | %-10s | %-9s | %-8s | %-10s |\n", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
                System.out.println("---------------------------------------------------------------------------------------------------");
                System.out.printf("| %-5d | %-25s | %-7.1f TL | %-10s | %-9s | %-8s | %-10d |\n",
                        filteredNotebook.getId(), filteredNotebook.getName(), filteredNotebook.getPrice(), filteredNotebook.getBrandName(),
                        filteredNotebook.getMemory(), filteredNotebook.getScreenSize(), filteredNotebook.getRam());
                System.out.println("---------------------------------------------------------------------------------------------------");
                return;
            }
        }
        System.out.println("Belirtilen ID'ye sahip ürün bulunamadı.");
    }

    @Override
    public void filterByProductBrand() {
        showProductList();
        System.out.println("Filtrelemek istediğiniz ürünün marka adini giriniz:");
        String searchBrand = scanner.next();

        for (Notebook filteredBrand : notebookList) {
            //equalsIgnoreCase buyuk kucuk harf duyarligigi icin
            if (filteredBrand.getBrandName().equalsIgnoreCase(searchBrand)) {
                System.out.println("---------------------------------------------------------------------------------------------------");
                System.out.printf("| %-5s | %-25s | %-10s | %-10s | %-9s | %-8s | %-10s |\n", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
                System.out.println("---------------------------------------------------------------------------------------------------");
                System.out.printf("| %-5d | %-25s | %-7.1f TL | %-10s | %-9s | %-8s | %-10d |\n",
                        filteredBrand.getId(), filteredBrand.getName(), filteredBrand.getPrice(), filteredBrand.getBrandName(),
                        filteredBrand.getMemory(), filteredBrand.getScreenSize(), filteredBrand.getRam());
                System.out.println("----------------------------------------------------------------------------------------------------");
                return;
            }
        }
        System.out.println("Belirtilen markaya sahip ürün bulunamadı.");
    }

    public Notebook idNumber(int id) {
        for (Notebook notebookId : notebookList) {
            if (notebookId.getId() == id) {
                return notebookId;
            }
        }
        return null;
    }
}
