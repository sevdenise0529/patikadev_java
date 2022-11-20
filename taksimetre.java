import java.util.Scanner;

public class taksimetre
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perKm=2.20, starPrice=10;
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        int km = input.nextInt();
        double total = km*perKm;
        total += starPrice;
        total = (total<20) ? 20 : total;
        System.out.println("Tutarınız: " + total);
    }
}    