import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = input.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        n=n-1;
        for(int i=n;i>=1;i--){
            for(int s=n-i;s>=0;s--){
                System.out.print(" ");
            }
            for(int t=2*i-1;t>0;t--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        input.close();
    }
}