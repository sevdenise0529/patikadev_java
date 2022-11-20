import java.util.Scanner;
public class sinifgecme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int matematik, fizik, turkce, kimya, muzik;
        int toplam=0;
        int dersayisi=0;

        System.out.print("Matematik notunu giriniz: ");
        matematik = input.nextInt();
        if(matematik<0 || matematik>100) {
            System.out.println("Geçersiz not.Ortalamaya dahil edilmedi!");
        }else {
            toplam+=matematik;
            dersayisi++;
        }
        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();
        if(fizik<0 || fizik>100) {
            System.out.println("Geçersiz not.Ortalamaya dahil edilmedi!");
        }
        else {
            toplam+=fizik;
            dersayisi++;
        }
        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();
        if(turkce<0 || turkce>100) {
            System.out.println("Geçersiz not.Ortalamaya dahil edilmedi!");
        }
        else {
            toplam+=turkce;
            dersayisi++;
        }
        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();
        if(kimya<0 || kimya>100) {
            System.out.println("Geçersiz not.Ortalamaya dahil edilmedi!");
        }else {
            toplam+=kimya;
            dersayisi++;
        }
        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextInt();
        if(muzik<0 || muzik>100) {
            System.out.println("Geçersiz not.Ortalamaya dahil edilmedi!");
        }else {
            toplam+=muzik;
            dersayisi++;
        }

        double sonuc = toplam / dersayisi;
        System.out.println("Ortalamanız: " + sonuc);
        if (sonuc >= 55) {
            System.out.println("Sınıf geçtiniz");
        } else {
            System.out.println("Sınıfta kaldınız");
        }

    }
}