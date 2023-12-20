import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r,fakn,fakr,fakt;
        double total;
        Scanner scan = new Scanner(System.in);
        System.out.println("n değerini giriniz : ");
        n = scan.nextInt();
        fakn = 1;
        fakr = 1;
        fakt = 1;
        System.out.println("r değerini giriniz : ");
        r = scan.nextInt();
        for(int i = 1;i<=n;i++){
            fakn *= i;
        }
        for(int i = 1;i<=r;i++){
            fakr *= i;
        }
        for(int i = 1;i<=(n-r);i++){
            fakt *= i;
        }
        total = fakn / (fakr*fakt);
        System.out.println("Kombinasyon sonucu : "+total);

    }
}