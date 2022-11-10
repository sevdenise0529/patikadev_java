import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        double armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlican = 5.00;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo : ");
        double kg1 = input.nextDouble();
        System.out.print("Elma Kaç Kilo : ");
        double kg2 = input.nextDouble();
        System.out.print("Domates Kaç Kilo : ");
        double kg3 = input.nextDouble();
        System.out.print("Muz Kaç Kilo : ");
        double kg4 = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo : ");
        double kg5 = input.nextDouble();
        double toplam = (kg1 * armut) + (kg2 * elma) + (kg3 * domates) + (kg4 * muz) + (kg5 * patlican) ;
        System.out.print("Toplam Tutar : " + toplam + " TL");
    }  
}