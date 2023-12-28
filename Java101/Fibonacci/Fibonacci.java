import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n1,n2,n3,s;
        n1=0;
        n2=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Eleman Sayısı : ");
        s= scan.nextInt();
        System.out.println();
        System.out.print(n1+" "+n2);
        for(int i=2;i<s;i++){
            n3 =n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        scan.close();
    }
}
