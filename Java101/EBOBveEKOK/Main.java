import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n1 :");
        int n1 = scan.nextInt();
        System.out.println("n2 :");
        int n2 = scan.nextInt();
        int ebob=0;
        int ekok=0;

        int k = n1;
        while (k>=1){
            if(n1%k==0 && n2%k==0){
                ebob = k;
                break;
            }
            k--;
        }
        System.out.println("EBOB : "+ebob);
        ekok = n1*n2/ebob;
        System.out.println("EKOK : "+ekok);
    }
}