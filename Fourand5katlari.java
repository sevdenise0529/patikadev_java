import java.util.Scanner;

public class Fourand5katlari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Girin: ");
        int sayi = input.nextInt();
        for ( int i=4 ; i<=sayi ; i*=4){
            System.out.println("Girilen sayidan kucuk dordun kuvvetleri : "+ i);

        }

        for (int i =5; i<=sayi; i*=5){
            System.out.println("Girilen sayidan kucuk besin kuvvetleri : " + i);
        }
    }
}
