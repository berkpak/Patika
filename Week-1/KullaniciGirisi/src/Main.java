import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName = "patika", password = "patikacohort", getUserName, getPassword, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici adini giriniz : ");
        getUserName = input.nextLine();
        System.out.print("Sifreyi giriniz : ");
        getPassword = input.nextLine();

        if ((getPassword.equals(password)) && (getUserName.equals(userName))) {
            System.out.println("Hosgeldiniz");
        } else if (!getPassword.equals(password)) {
            System.out.println("Sifreyi yanlis giridniz");
            System.out.println("Sifrenizi sifirlamak istermisiniz? : y/n ");
            String changePassword = input.nextLine();
            if (changePassword.equals("y")) {
                System.out.print("Yeni sifre giriniz: ");
                newPassword = input.nextLine();
                if (newPassword.equals(getPassword)) {
                    System.out.println("Yeni sifreniz eski sifrenizle ayni olamaz yeni sifre giriniz");
                } else {
                    System.out.println("Sifre Yenilendi");
                }
            } else {
                System.out.println("Sifre yenileme iptal edildi");
            }
        }
    }
}
