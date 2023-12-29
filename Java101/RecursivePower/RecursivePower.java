import java.util.Scanner;

public class RecursivePower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Taban değerini giriniz : ");
        int base = scan.nextInt();
        System.out.println("Üs değerini giriniz : ");
        int pow = scan.nextInt();
        System.out.println("Sonuç : "+getPow(base,pow));
    }
    static int getPow(int base,int pow){
        if(pow==0)
            return 1;
        return base*getPow(base,pow-1);
    }
}
