import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int k,total;
        total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        k = scan.nextInt();

        for(int i = 0;i<=k;i++){
            if(i%3==0 && i%4==0){
                total+=i;
            }else{
                continue;
            }
        }
        System.out.println("3\'e ve 4\'e Tam Bölünen Sayıların Toplamı : "+total);
        scan.close();
    }
}