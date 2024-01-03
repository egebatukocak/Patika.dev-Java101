import java.util.Scanner;

public class EnYakınSayıBul {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Girilen sayı : ");
        int number = scan.nextInt();

        for (int i : list) {
            if (i < 5) {
                if(i > max){
                    max = i;
                }

            }
            if (i > 5) {
                if(i < min){
                    min = i;
                }
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + max);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + min);
        scan.close();
    }
}
