import java.util.Scanner;

public class kdvHesaplama
{
	public static void main(String[] args) {
	    
      Scanner input=new Scanner(System.in);
      double kdvOran=0.18, kdvOran2=0.08;
      System.out.print("Ucret Tutarını Giriniz: ");
      int tutar = input.nextInt();
      
      double tutarKdv = (tutar>1000) ? tutar*kdvOran : tutar*kdvOran2
      double tutarKdvli = tutar+tutarKdv;
      
      System.out.println("Tutar: "+tutar);
      System.out.println("KDV Tutar: "+tutarKdv);
      System.out.println("KDV'li Tutar: "+tutarKdvli);
	}
}