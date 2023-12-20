import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,h;
        int s=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Üssü hesaplanacak sayı : ");
        n = scan.nextInt();
        System.out.println("Üssü olacak sayı : ");
        h = scan.nextInt();

        for(int i=1;i<=h;i++){
            s*=n;
        }
        System.out.println(s);
    }
}