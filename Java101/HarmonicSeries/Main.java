import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        double result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        number = scan.nextInt();

        for(int i=1;i<=number;i++){
            result += (double) 1 /i;
        }
        System.out.println("Harmonik Seri : "+result);
        scan.close();
    }
}