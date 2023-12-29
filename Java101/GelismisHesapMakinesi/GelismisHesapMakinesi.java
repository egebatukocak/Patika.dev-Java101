import java.util.Scanner;

public class GelismisHesapMakinesi {
    static void sum() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Sonuç : " + result);
    }

    static void mod(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Modu alınacak değeri giriniz :");
        int dividend = scan.nextInt();
        System.out.print("Bölün değeri giriniz :");
        int divider = scan.nextInt();
        int result = dividend % divider;
        System.out.println("Sonuç : " + result);
    }
    static void rectangle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk kenarın değerini giriniz : ");
        int n1 = scan.nextInt();
        System.out.println("İkinci kenarın değerini giriniz : ");
        int n2 = scan.nextInt();
        int perimeter = 2*(n1+n2);
        System.out.println("Çevre : " + perimeter);
        int area = n1*n2;
        System.out.println("Alan : "+ area);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama\n" +
                "2- Çıkarma\n" +
                "3- Çarpma\n" +
                "4- Bölme\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesaplama\n" +
                "0- Çıkış Yap\n";
        do{
            System.out.println(menu);
            System.out.println("Bir İşlem Seçiniz : ");
            select = scan.nextInt();
            switch (select){
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7 :
                    mod();
                    break;
                case 8 :
                    rectangle();
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
                    break;
            }
        }while(select!=0);
        scan.close();
    }
}
