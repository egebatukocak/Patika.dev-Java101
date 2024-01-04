import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin Boyutu n : ");
        int n = scan.nextInt();
        int[] number = new int[n];
        System.out.println("Dizinin Elemanlarını Giriniz : ");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". Elamanı : ");
            number[i] = scan.nextInt();
        }
        System.out.println("Dizi : " + Arrays.toString(number));
        Arrays.sort(number);
        System.out.println("Sıralama : " + Arrays.toString(number));

        scan.close();
    }
}
