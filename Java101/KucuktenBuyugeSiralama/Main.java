import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("1. Sayı : ");
        a = s.nextInt();
        System.out.println("2. Sayı : ");
        b = s.nextInt();
        System.out.println("3. Sayı : ");
        c = s.nextInt();

        if(a>b && a>c){
            if(b>c){
                System.out.println(a+" > "+b+" > "+c);
            }else{
                System.out.println(a+" > "+c+" > "+b);
            }
        }else if(b>a && b>c){
            if(a>c){
                System.out.println(b+" > "+a+" > "+c);
            }else{
                System.out.println(b+" > "+c+" > "+a);
            }
        }else if(c>b && c>a){
            if(b>a){
                System.out.println(c+" > "+b+" > "+a);
            }else{
                System.out.println(c+" > "+a+" > "+b);
            }
        }
    }
}