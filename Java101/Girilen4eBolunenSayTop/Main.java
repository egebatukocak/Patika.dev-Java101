import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n1, toplam=0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Sayı Girin: ");
            n1 = input.nextInt();
            if(n1%4==0){
                toplam+=n1;
            }
        }while(n1%2==0);
        System.out.println("Sonuç: " + toplam);
    }
}