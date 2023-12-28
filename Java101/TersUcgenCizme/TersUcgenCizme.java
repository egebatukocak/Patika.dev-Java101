import java.util.Scanner;
public class TersUcgenCizme {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Basamak sayısnı giriniz: ");
            int n = scan.nextInt();
            int basamak = 2*n-1;
            for (int i=n; i>0; i--)
            {
                for (int j=0; j<(n-i); j++)
                {
                    System.out.print(" ");
                }
                for (int k = basamak; k > 0; k--)
                {
                    System.out.print("*");
                }
                basamak-=2;
                System.out.println();
            }
            scan.close();
        }
    }
