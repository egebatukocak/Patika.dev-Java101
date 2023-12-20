/* KDV 1.8
*Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
* tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvTutar,kdvliTutar,kdv;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz : ");
        tutar = scan.nextDouble();
        if(tutar>0 && tutar<1000){
            kdv=0.18;
            kdvTutar = tutar*kdv;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("KDVli Tutar : "+kdvliTutar);
        }
        else{
            kdv=0.08;
            kdvTutar = tutar*kdv;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("KDVli Tutar : "+kdvliTutar);
        }

    }
}