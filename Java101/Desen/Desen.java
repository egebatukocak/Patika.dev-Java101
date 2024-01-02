import java.util.Scanner;

public class Desen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir n değeri girin: ");
        int n = scanner.nextInt();

        desen(n);

        scanner.close();
    }

    static void desen(int a){
        System.out.print(a + " ");

        if (a <= 0)
        {
            return;
        }
        desen(a - 5);
        if (a > 0)
        {
            System.out.print(a + " ");

        }
    }
}
