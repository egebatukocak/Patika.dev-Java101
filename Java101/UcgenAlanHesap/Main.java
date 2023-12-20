/*Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.*/
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        double alan,u;
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk Kenarı Giriniz : ");
        a = scan.nextInt();
        System.out.println("İkinci Kenarı Giriniz : ");
        b = scan.nextInt();
        System.out.println("Üçüncü Kenarı Giriniz : ");
        c = scan.nextInt();

        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı : "+alan);
    }
}