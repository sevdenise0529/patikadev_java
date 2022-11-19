import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName, password, dene;
        int select;

        String USER_NAME = "patika";
        String PASSWORD = "java123";

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals(USER_NAME) && password.equals(PASSWORD)) {
            System.out.println("Giriş Başarılı! ");
        } else if (userName.equals(USER_NAME) && !password.equals(PASSWORD)) {
            System.out.println("Yanlış şifre girdiniz!!! ");
            System.out.println("Şifreyi sıfırlamak istiyor musunuz? \nİstiyorsanız 1'e seç\nİstemiyorsanız 1'e seç");
            select = input.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Şifre Değiştirme Ekranına Hoş Geldiniz!");
                    System.out.println("Lütfen seçtiğiniz yeni şifre aynı değildir.");

                    System.out.println("Yeni şifreyi girin: ");
                    String newPassword = input.nextLine();

                    if (newPassword.equals(PASSWORD) || newPassword.equals(password)) {
                        System.out.println("Şifre aynı. Şifre oluşturulmadı. Lütfen tekrar deneyiniz");

                    } else {
                        System.out.println("Yeni şifre oluşturuldu");
                        password = newPassword;
                        System.out.println("Şifreniz: " + password);
                        System.out.println("Programından çıkılıyor...");
                    }
                    break;
                case 2:
                    System.out.println("Programından çıkılıyor...");
                    break;
            }
            if (!userName.equals(USER_NAME) && password.equals(PASSWORD)) {
                System.out.println("Yanlış kullanıcı adı girdiniz!!!");
            } else {
                System.out.println("Tüm bilgiler yanlış girdiniz!!!");
            }
        }
    }
    }