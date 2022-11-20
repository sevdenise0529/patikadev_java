import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double normal, indyas, indirim, toplam, gido;
        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int tip = input.nextInt();

        if(yas>0 && mesafe>0 || tip==1 || tip==2){
            normal = mesafe*0.10;
            if(yas<12){
                indyas = normal*0.5;
                indirim = normal-indyas;
                toplam = indirim;
                if (tip==2){
                    gido = indirim*0.2;
                    toplam = (indirim-gido)*2;
                }
                System.out.println("Bilet Tutarı: "+toplam);
            }
            else if(yas>=12 && yas<=24){
                indyas = normal*0.1;
                indirim = normal-indyas;
                toplam = indirim;
                if (tip==2){
                    gido = indirim*0.2;
                    toplam = (indirim-gido)*2;
                }
                System.out.println("Bilet Tutarı: "+toplam);
            }
            else if(yas>24 && yas<65){
                normal = mesafe*0.1;
                toplam = normal;
                if (tip==2){
                    gido = normal*0.2;
                    toplam = (normal-gido)*2;
                }
                System.out.println("Bilet Tutarı: "+toplam);
            }
            else if(yas<=65){
                indyas = normal*0.3;
                indirim = normal-indyas;
                toplam = indirim;
                if (tip==2){
                    gido = indirim*0.2;
                    toplam = (indirim-gido)*2;
                }
                System.out.println("Bilet Tutarı: "+toplam);
            }
        }
        else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}