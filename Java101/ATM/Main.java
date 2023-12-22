import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName,password;
        int right=3;
        int balance=1500;
        int select;
        Scanner input = new Scanner(System.in);

        while(right>0){
            System.out.println("Kullanıcı Adı :");
            userName = input.nextLine();
            System.out.println("Şifre :");
            password = input.nextLine();
            if(userName.equals("patika")&&password.equals("dev123")){
                System.out.println("Merhaba hoşgeldiniz.");
                do{
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1 - Para yatırma\n" + "2 - Para çekme\n" + "3 - Bakiye sorgula\n" + "4 - Çıkış yap");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Para miktarı : ");
                            int price = input.nextInt();
                            balance+= price;
                            System.out.println("Yeni bakiyeniz : "+balance);
                            break;
                        case 2:
                            System.out.println("Para miktarı : ");
                            int p = input.nextInt();
                            if(p>balance){
                                System.out.println("Bakiye yetersiz.Tekrar deneyin.");
                            }else{
                                balance-=p;
                                System.out.println("Yeni bakiyeniz : "+balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : "+balance);
                            break;
                    }
                }while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }else{
                right--;
                System.out.println("Hatalı giriş. Lütfen tekrar deneyiniz.");
                System.out.println("Kalan hakkınız : "+ right);
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur.");
                }
            }
        }

    }
}