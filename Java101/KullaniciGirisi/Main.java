import java.io.BufferedReader;
import java.io.Reader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String username,password,us,ps,newPassword;
        int select;

        us = "Patika";
        ps = "java123";
        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanıcı Adı : ");
        username = scan.nextLine();
        System.out.println("Şifre : ");
        password = scan.nextLine();

        if (username.equals(us) && password.equals(ps)) {
            System.out.print("Giriş Başarılı !!");

        } else if(!(username.equals(us)) && !(password.equals(ps))){
            System.out.print("Hatalı Giriş .Kullanıcı adı ve şifre yanlıştır!! Lütfen bilgileri kontrol edip tekrar deneyiniz.");

        } else if(!(password.equals(ps)) && (username.equals(us))) {
            System.out.println("Hatalı Şifre!!!");
            System.out.println("Şifrenizi unuttuysanız adımları takip edin\n1 - Yeni şifre oluşturmak.\n2 - Giriş ekranından ayrılmak.");
            System.out.print("Seçiminiz: ");

            select = scan.nextInt();
            scan.nextLine();
            //select = Integer.parseInt(scan.nextLine());

            switch (select) {
                case 1:
                    System.out.println("Yeni şifre giriniz .(Lütfen daha önceki şifrelerinizden farklı bir şifre oluşturunuz:");
                    newPassword = scan.nextLine();

                    if (!newPassword.equals(ps)) {
                        System.out.println("Yeni şifreniz başarı ile oluşturuldu.");

                    } else {
                        System.out.println("Hatalı deneme!! Yeni şifre eskisiyle aynı olamaz. Tekrar Deneyiniz");
                    }
                    break;
                case 2:
                    System.out.println("kullanıcı giriş sayfanda ayrılıyorsunuz ... iyi günler .");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız!! Lütfen sadece 1 ve 2 seçeneklerinden birini giriniz.");
                    break;

            }
        }
        else  {
            System.out.println("Kullanıcı adı hatalı lütfen Kullanıcı adını kontrol edip tekrar deneyiniz.");
        }



    }
}