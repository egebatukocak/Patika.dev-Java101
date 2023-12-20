/*Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int baslangıcTutar = 10;
        double km,tutar;
        double perKm = 2.20;
        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafeyi KM Cinsinden Giriniz : ");
        km = scan.nextDouble();
        tutar=km*perKm;
        tutar+=baslangıcTutar;

        if(tutar<20){
            System.out.println("Ödenecek Tutar 20 TL\'dir.");
        }
        else{
            System.out.println("Ödenecek Tutar "+tutar+" TL\'dir.");
        }
    }
}