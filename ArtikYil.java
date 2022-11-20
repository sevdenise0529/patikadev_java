import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        int yil = input.nextInt();
        int artik_yil = yil%4;
        if (artik_yil==0){
            System.out.println(yil +" bir artık yıldır");
        }
        else {
            System.out.println(yil +" bir artık yıl değildir!");
        }
    }
}