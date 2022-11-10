import java.util.Scanner;

public class ucgeninalanı
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Üçgenin 1.kenarını giriniz: ");
	    int a = input.nextInt();
	    System.out.print("Üçgenin 2.kenarını giriniz: ");
	    int b = input.nextInt();
		System.out.print("Üçgenin 3.kenarını giriniz: ");
	    int c = input.nextInt();
	    
	    int cevre = a+b+c;
	    double u = cevre/2;
	    double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
	    System.out.println("Çevre: "+cevre);
	    System.out.println("Alan: "+alan);
	}
}