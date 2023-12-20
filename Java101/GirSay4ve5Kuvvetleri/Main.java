import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sınır Sayısını Giriniz : ");
        n = scan.nextInt();

        for (int i = 1; i <= n;i*=4){
            System.out.println("4'ün "+ count + ". kuvveti: " + i);
            count++;
        }
        count=0;
        for (int i = 1; i <= n;i*=5){
            System.out.println("5'in "+ count + ". kuvveti: " + i);
            count++;
        }
    }
}