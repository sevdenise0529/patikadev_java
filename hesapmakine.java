import java.util.Scanner;
public class hesapmakine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, select;
        System.out.print("1.sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("2.sayıyı giriniz: ");
        b = input.nextInt();
        System.out.println("1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama: " + (a + b));
                break;
            case 2:
                System.out.println("Çıkarma: " + (a - b));
                break;
            case 3:
                System.out.println("Çarpma: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Bölme: " + (a / b));
                } else {
                    System.out.println("Bir sayı O'ı bölünemez.");
                }
                break;
            default:
                System.out.println("Yanlış secim yaptınız. Lütfen tekrar deneyiz!");
        }
    }
}