import java.util.Scanner;

public class Game {

    private final Scanner input = new Scanner(System.in);

    public void start() {

        System.out.println("Macera Oyununa Hosgeldiniz");
        System.out.print("Lutfen bir isim giriniz : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName() + " Hosgeldiniz !");
        System.out.println("Oyunda kullanacaginiz karakteri seciniz !");
        player.selectChar();

        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println();
            System.out.println("Bolgeler");
            System.out.println();
            System.out.println("1- Guvenli Ev");
            System.out.println("2- Esya Dukkani --> Silah veya zirhh satin alabilirsiniz !");
            System.out.println("3- Magara --> Odul <Yemek>, Dikkatli ol zombi cikabilir !!");
            System.out.println("4- Orman --> Odul <Odun>, Dikkatli ol vampir cikabilir !!");
            System.out.println("5- Nehir --> Odul <Su>, Dikkatli ol ayi cikabilir !!");
            System.out.println("0- Cikis Yap --> Oyunu Sonlandir !");

            System.out.print("Gitmek istediginiz bolgeyi seciniz :");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Gecerli bir  bolge giriniz");
            }
            if(location == null){
                System.out.println("Oyun bitti gorusmek uzere");
                break;
            }
            // boolean oldugu icin tersini al
            if(!location.onLocation()){
                System.out.println("GAME OVER !!");
                break;
            }
        }
    }
}

