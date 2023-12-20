/*Java ile Matematik, Fizik, Kimya, Türkçe, Müzik derslerinin
 sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
 Ve eğer kullanıcının ortalaması 55'den büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
 Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fiz,kim,turk,muz,sayac;
        sayac=0;
        float ort = 0;
        Scanner scan= new Scanner(System.in);

        System.out.println("Matematik notu : ");
        mat = scan.nextInt();
        System.out.println("Fizik notu : ");
        fiz = scan.nextInt();
        System.out.println("Kimya notu : ");
        kim = scan.nextInt();
        System.out.println("Türkçe notu : ");
        turk = scan.nextInt();
        System.out.println("Müzik notu : ");
        muz = scan.nextInt();
        int [] notlar = {mat,fiz,kim,turk,muz};

        for(int i=0;i<5;i++){
            if(notlar[i]>=0 && notlar[i]<=100){
                sayac++;
                ort+= (float)notlar[i];
            }
        }
        ort= ort/sayac;

        System.out.println("Ortalama : "+ort);
        if(ort>55){
            System.out.println("Sınıfı Geçti.");
        }
        else{
            System.out.println("Sınıfta Kaldı.");
        }

    }
}