import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int yas,km,tip;
        double tutar = 0;
        double ntutar;
        Scanner scan = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz : ");
        km = scan.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        yas = scan.nextInt();
        System.out.println("Yolculuk tipini giriniz(1-> Tek Yön , 2-> Gidiş Dönüş) : ");
        tip = scan.nextInt();

        if(yas<0 || km<0 || tip<0 || tip>2){
            System.out.println("Hatalı veri girdiniz!!!");
        }else{
            if(tip==1){
                ntutar = km * 0.1;
                if(yas<12 ){
                    tutar = ntutar * 0.5;
                }else if(yas>12 && yas<24){
                    tutar = ntutar * 0.9;
                }else if(yas>65){
                    tutar = ntutar * 0.7;
                }else{
                    tutar = ntutar;
                }
            }else if(tip==2){
                ntutar = km * 0.1;
                if(yas<12 ){
                    tutar = ntutar * 0.5;
                    tutar = tutar * 0.8 * 2;
                }else if(yas>12 && yas<24){
                    tutar = ntutar * 0.9;
                    tutar = tutar * 0.8 * 2;
                }else if(yas>65){
                    tutar = ntutar * 0.7;
                    tutar = tutar * 0.8 * 2;
                }else{
                    tutar = ntutar;
                    tutar = tutar * 0.8 * 2;
                }
            }

        }
        System.out.println("Toplam Tutar : "+tutar);

    }
}