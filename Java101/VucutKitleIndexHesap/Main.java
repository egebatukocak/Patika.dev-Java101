/* Kilo (kg) / (Boy(m) * Boy(m)) */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kilo,boy,vki;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz(kg cinsinden) : ");
        kilo = scan.nextDouble();
        System.out.println("Boyunuzu Giriniz(metre cinsinden) : ");
        boy = scan.nextDouble();
        vki = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+vki);

    }

}