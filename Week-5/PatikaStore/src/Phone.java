import java.util.ArrayList;
import java.util.Scanner;

public class Phone extends Product implements IOperation{

    private int camera;
    private int batteryCapacity;
    private String color;
    private static ArrayList<Phone> phoneList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Phone(int id, String name, double price, double discountRate, int stock, String brandName, String screenSize, int ram, String memory, int camera, int batteryCapacity, String color) {
        super(id, name, price, discountRate, stock, brandName, screenSize, ram, memory);
        this.camera = camera;
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }

    public Phone() {

    }
    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    static {
        phoneList.add(new Phone(1,"Samsung Galaxy A51",3199,10,10,"Samsung","6.5",6,"128",32,4000,"Siyah"));
        phoneList.add(new Phone(2,"Iphone 11",7379,10,10,"Apple","6.1",6,"10",5,3050,"Mavi"));
    }

    @Override
    public void runMenu() {
        boolean isRunning = true;
        do{
            System.out.println("Telefon Yonetim Paneli");
            System.out.println("--------------------------");
            System.out.println("1- Telefon Listeleme \n" +
                    "2- Telefon Ekleme \n" +
                    "3- Telefon Silme \n" +
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
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-5s | %-25s | %-10s | %-10s | %-9s | %-8s | %-10s | %-9s | %-15s | %-15s |\n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM", "Kamera", "Batarya", "Renk");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Phone phone : phoneList) {
            System.out.printf("| %-5d | %-25s | %-7.1f TL | %-10s | %-9s | %-8s | %-10d | %-6d MP | %-11d mAh | %-15s |\n",
                    phone.getId(), phone.getName(), phone.getPrice(), phone.getBrandName(),
                    phone.getMemory(), phone.getScreenSize(), phone.getRam(), phone.getCamera(), phone.getBatteryCapacity(), phone.getColor());
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
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
        System.out.print("Ekran boyutunu giriniz :");
        String newScreenSize = scanner.next();
        System.out.print("Ram degerini giriniz :");
        int newRam = scanner.nextInt();
        System.out.print("Depolama degerini giriniz :");
        String newMemory = scanner.next();
        System.out.print("Kamera giriniz :");
        int newCamera = scanner.nextInt();
        System.out.print("Pil degerini giriniz :");
        int newBattery = scanner.nextInt();
        System.out.print("Renk secenegini giriniz :");
        String newColor = scanner.next();

        phoneList.add(new Phone(newID, newName, newPrice, newDiscount, newStock, newBrand, newScreenSize, newRam, newMemory,newCamera,newBattery,newColor));
        System.out.println();
        System.out.println("Urun eklendi.");
        System.out.println("Guncel telefon listesi");
        showProductList();
    }

    @Override
    public void deleteProduct() {
        showProductList();
        System.out.println("Silmek istediginiz urunun ID numarasini giriniz :");
        int selectedID = scanner.nextInt();

        Phone phoneDelete = idPhone(selectedID);

        if (phoneDelete == null) {
            System.out.println("ID bulunamadi");
        } else {
            phoneList.remove(phoneDelete);
            System.out.println("Urun Kaldirildi.");
        }
        System.out.println();
        System.out.println("Guncel telefon listesi");
        showProductList();
    }

    @Override
    public void filterByProductId() {
        showProductList();
        System.out.println("Filtrelemek istediğiniz ürünün ID numarasını giriniz:");
        int searchId = scanner.nextInt();

        for (Phone filteredNotebook : phoneList) {
            if (filteredNotebook.getId() == searchId) {
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %-5s | %-25s | %-10s | %-10s | %-9s | %-8s | %-10s | %-9s | %-15s | %-15s |\n",
                        "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM", "Kamera", "Batarya", "Renk");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %-5d | %-25s | %-7.1f TL | %-10s | %-9s | %-8s | %-10d | %-6d MP | %-11d mAh | %-15s |\n",
                        filteredNotebook.getId(), filteredNotebook.getName(), filteredNotebook.getPrice(), filteredNotebook.getBrandName(),
                        filteredNotebook.getMemory(), filteredNotebook.getScreenSize(), filteredNotebook.getRam(), filteredNotebook.getCamera(), filteredNotebook.getBatteryCapacity(), filteredNotebook.getColor());
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
                return; // urun id numarasi ile eslestikten sonra metodun calismasini durdurmak icin
            }
        }
        System.out.println("Girilen ID'ye sahip ürün bulunamadı.");
    }


    @Override
    public void filterByProductBrand() {
        showProductList();
        System.out.println("Filtrelemek istediğiniz ürünün marka adini giriniz:");
        String searchBrand = scanner.next();

        for (Phone filteredBrand : phoneList) {
            //equalsIgnoreCase buyuk kucuk harf duyarligigi icin
            if (filteredBrand.getBrandName().equalsIgnoreCase(searchBrand)) {
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %-5s | %-25s | %-10s | %-10s | %-9s | %-8s | %-10s | %-9s | %-15s | %-15s |\n",
                        "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM", "Kamera", "Batarya", "Renk");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %-5d | %-25s | %-7.1f TL | %-10s | %-9s | %-8s | %-10d | %-6d MP | %-11d mAh | %-15s |\n",
                        filteredBrand.getId(), filteredBrand.getName(), filteredBrand.getPrice(), filteredBrand.getBrandName(),
                        filteredBrand.getMemory(), filteredBrand.getScreenSize(), filteredBrand.getRam(), filteredBrand.getCamera(), filteredBrand.getBatteryCapacity(), filteredBrand.getColor());
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
                return;
            }
        }
        System.out.println("Belirtilen markaya sahip ürün bulunamadı.");
    }

    public Phone idPhone (int id) {
        for (Phone phoneId : phoneList) {
            if (phoneId.getId() == id) {
                return phoneId;
            }
        }
        return null;
    }
}
