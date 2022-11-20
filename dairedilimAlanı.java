import java.util.Scanner;

public class dairedilimAlanı
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi=3.14;
        System.out.print("Yarıçapı giriniz: ");
        int r = input.nextInt();
        System.out.print("Merkez açısını giriniz: ");
        int a = input.nextInt();
        
        double alan = (pi*(r*r)*a)/360;
        System.out.println("Daire Diliminin Alanı: " + alan);
    }
}    
