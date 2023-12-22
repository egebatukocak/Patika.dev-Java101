import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int count;
        int n;
        int minn = Integer.MAX_VALUE;
        int maxn = Integer.MIN_VALUE;

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        count = scan.nextInt();
        for(int i=1;i<=count;i++){
            System.out.println(i+". Sayıyı giriniz: ");
            n = scan.nextInt();

            if (n > maxn) {
                maxn = n;
            }

            if (n < minn) {
                minn = n;
            }
        }
        System.out.println("En büyük sayı: "+maxn);
        System.out.println("En küçük sayı: "+minn);
        scan.close();
    }
}