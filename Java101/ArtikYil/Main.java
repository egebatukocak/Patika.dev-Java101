import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Yıl Giriniz : ");
        year = scan.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year + "artık yıldır.");
                }else {
                    System.out.println(year +" artık yıl değildir.");
                }
            }else {
                System.out.println(year + "artık yıldır.");
            }
        }else {
            System.out.println(year + "artık yıl değildir.");
        }
        scan.close();
    }
}