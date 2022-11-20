import java.util.Scanner;

public class vucutkitleindesi
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double m = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        double kg = input.nextDouble();
        
        double indeks = kg/(m*m);
        System.out.println("Vücut Kitle İndeksiniz: " + indeks);
    } 
}
