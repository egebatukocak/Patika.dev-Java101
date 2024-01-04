import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100);

        Scanner scan = new Scanner(System.in);
        int right = 0;
        int sel;
        int[]wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        while (right<5){
            System.out.print("Tahmininiz : ");
            sel = scan.nextInt();
            if(sel<0 || sel>100){
                System.out.println("Lütfen 0-100 arası bir sayı giriniz !!");
                if(!isWrong){
                    isWrong = true;
                    System.out.println("Bir kez daha değer aralığı dışında bir değer girerseniz hakkınızdan düşürülecektir.");
                }else{
                    System.out.println("Çok fazla hatalı giriş yaptınız. \nKalan hakk : "+(5-(++right)));
                }
                continue;
            }
            if(sel==num){
                System.out.println("Tebrikler doğru takmin !! \n Sayı : "+ num);
                isWin = true;
                break;
            }else {
                wrong[right] = sel;
                right++;
                System.out.println("Bilemediniz !");
                if(sel>num){
                    System.out.println(sel + " sayısı, gizli sayıdan büyüktür.");
                }else{
                    System.out.println(sel + " sayısı, gizli sayıdan küçüktür.");
                }
                System.out.println("Kalan hakk : "+(5-right));
            }
        }
        if(!isWin ){
            System.out.println("Kaybettiniz !! ");
            if(!isWrong){
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
            System.out.println("Gizli Sayı : "+num);
        }
    }
}
