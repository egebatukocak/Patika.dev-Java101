/*Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5.00;
        double kulArmut,kulElma,kulDomates,kulMuz,kulPatlıcan,toplam;
        Scanner scan = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        kulArmut = scan.nextDouble();
        System.out.println("Elma Kaç Kilo ? :");
        kulElma = scan.nextDouble();
        System.out.println("Domates Kaç Kilo ? :");
        kulDomates = scan.nextDouble();
        System.out.println("Muz Kaç Kilo ? :");
        kulMuz = scan.nextDouble();
        System.out.println("Patlıcan Kaç Kilo ? :");
        kulPatlıcan = scan.nextDouble();

        toplam = armut*kulArmut + elma*kulElma + domates*kulDomates + muz*kulMuz + patlıcan*kulPatlıcan;
        System.out.println("Toplam Tutar : "+toplam);
    }
}