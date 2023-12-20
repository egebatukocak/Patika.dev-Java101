/*Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin
 sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
 Ve eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fiz,kim,turk,tar,muz;
        float ort;
        Scanner scan= new Scanner(System.in);

        System.out.println("Matematik notu : ");
        mat = scan.nextInt();
        System.out.println("Fizik notu : ");
        fiz = scan.nextInt();
        System.out.println("Kimya notu : ");
        kim = scan.nextInt();
        System.out.println("Türkçe notu : ");
        turk = scan.nextInt();
        System.out.println("Tarih notu : ");
        tar = scan.nextInt();
        System.out.println("Müzik notu : ");
        muz = scan.nextInt();

        ort= (float) (mat+fiz+kim+turk+tar+muz)/6;

        System.out.println("Ortalama : "+ort);
        if(ort>60){
            System.out.println("Sınıfı Geçti.");
        }
        else{
            System.out.println("Sınıfta Kaldı.");
        }

    }
}