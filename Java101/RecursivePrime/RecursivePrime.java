import java.util.Scanner;

public class RecursivePrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        int number = scan.nextInt();
        if(isPrime(number,number/2) == true)
            System.out.println(number + " sayısı ASALDIR !");
        else
            System.out.println(number + " sayısı ASAL DEĞİLDİR !");
        scan.close();
    }
    static boolean isPrime(int number,int i){

        if(i==1) return true;
        else {
            if (number%i==0){
                return false;
            }
            else return isPrime(number,i-1);
        }
    }
}
