import java.util.Scanner;
public class GirilenSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;
        int sayi=0, toplam=0,sonuc;
        System.out.print("Sayiyi giriniz:");
        k = input.nextInt();
        for(int i=0; i<=k; i++){
            if (i%3==0 && i%4==0){
                System.out.println(i);
                toplam+=i;
                sayi++;
            }
        }
        sonuc = toplam/(sayi-1);
        System.out.println("Sonuc: "+sonuc);
    }
}