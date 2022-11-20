import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Girilen üç sayıyı sıralayınız");
        System.out.print("1.sayı: ");
        int a = input.nextInt();
        System.out.print("2.sayı: ");
        int b = input.nextInt();
        System.out.print("3.sayı: ");
        int c = input.nextInt();

        if((a>b) && (a>c)){
            if(b>c){
                System.out.println(c+"<"+b+"<"+a);
            }
            else{
                System.out.println(b+"<"+c+"<"+a);
            }
        }
        else if((b>a) && (b>c)){
            if(a>c){
                System.out.println(c+"<"+a+"<"+b);
            }
            else{
                System.out.println(a+"<"+c+"<"+b);
            }
        }
        else if((c>a) && (c>b)){
            if(b>a){
                System.out.println(a+"<"+b+"<"+c);
            }
            else{
                System.out.println(b+"<"+a+"<"+c);
            }
        }
        else{
            System.out.println("Sayılar eşittir");
        }
    }
}