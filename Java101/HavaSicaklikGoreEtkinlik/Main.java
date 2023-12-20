/*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sıcaklığı Giriniz : ");
        heat = scan.nextInt();
        if(heat>25){
            System.out.println("Yüzmeye Gidebilirsin.");
        }else if(heat<=25 && heat>15){
            System.out.println("Piknik Yapabilirsin.");
        }else if(heat<=15 && heat>5){
            System.out.println("Sinemaya Gidebilirsin.");
        }else{
            System.out.println("Kayak Yapabilirsin.");
        }
    }
}