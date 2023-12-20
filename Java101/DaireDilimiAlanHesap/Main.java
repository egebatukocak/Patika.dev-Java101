/* Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r,a;
        double pi,alan;
        pi = 3.14;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dairenin Yarı Çapını Giriniz : ");
        r = scan.nextInt();
        System.out.println("Daire Diliminin Açısını Giriniz : ");
        a = scan.nextInt();
        alan = (pi*r*r*a)/360;

        System.out.println("Daire Diliminin Alanı : "+alan);
    }
}