import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int total = 0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scan.nextInt();

        for(int i=1;i<n;i++){
            if(n%i==0){
                total+=i;
            }
        }
        if (total == n) {
            System.out.println(n + " Mükemmel Sayıdır");
        } else if (n < 0) {
            System.out.println("Lütfen Pozitif Sayı Giriniz");
        } else {
            System.out.println(n + " Mükemmel Sayı Değildir !");
        }
        scan.close();
    }
}
