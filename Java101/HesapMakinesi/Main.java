
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int s;
        double n1,n2;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Sayınız : ");
        n1 = scan.nextDouble();
        System.out.println("2. Sayınız : ");
        n2 = scan.nextDouble();

        System.out.println("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");
        System.out.print("Seçiniz : ");
        s = scan.nextInt();

        switch (s){
            case 1:
                System.out.println("Toplama İşlemi : "+ (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma İşlemi :"+ (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma İşlemi : "+ (n1*n2));;
                break;
            case 4:
                System.out.println("Bölme İşlemi : "+ (n1/n2));
                break;
            default:
                System.out.println("Bu İşlem Geçersizdir.");
                break;
        }


    }
}