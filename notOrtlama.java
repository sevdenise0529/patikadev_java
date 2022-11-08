import java.util.Scanner;

public class notOrtlama
{
	public static void main(String[] args) {
	    
      Scanner input=new Scanner(System.in);
      int mat, fizik, kimya, turkce, tarih, muzik;
      
      System.out.print("Matematik notu: ");
      mat=input.nextInt();
      
      System.out.print("Fizik notu: ");
      fizik=input.nextInt();
      
      System.out.print("Kimya notu: ");
      kimya=input.nextInt();
      
      System.out.print("Turkce notu: ");
      turkce=input.nextInt();
      
      System.out.print("Tarih notu: ");
      tarih=input.nextInt();
      
      System.out.print("Muzik notu: ");
      muzik=input.nextInt();
      
      int toplam=mat+fizik+kimya+turkce+tarih+muzik;
      double ort=toplam/6;
      System.out.println("Ortalama: "+ort);
      
      String snc = ort > 60 ? "Sınıfı geçti" :  "Sınıfta kaldı";
      System.out.println(snc);
	}
}