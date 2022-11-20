import java.util.Scanner;
public class girilesayiCift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam=0;
        do{
            System.out.print("Sayiyi giriniz:");
            sayi = input.nextInt();
            if(sayi%4==0){
                toplam+=sayi;
            }
        }
        while(sayi%2==0);
        System.out.println("Sonuc: "+toplam);
    }
}