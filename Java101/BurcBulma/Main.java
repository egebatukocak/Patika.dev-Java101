import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int month,day;
        Scanner input = new Scanner(System.in);
        System.out.println("Doğdunuz Ay : ");
        month = input.nextInt();
        System.out.println("Doğdunuz Gün : ");
        day = input.nextInt();

        if(month==1){
            if(0<day && day<22){
                System.out.println("Burcunuz Oğlaktır.");
            }else if(day>21 && day<32){
                System.out.println("Burcunuz Kovadır.");
            }
        }
        else if(month==2){
            if(0<day && day<20){
                System.out.println("Burcunuz Kovadır.");
            }else if(day>19 && day<30){
                System.out.println("Burcunuz Balıktır.");
            }
        }
        else if(month==3){
            if(0<day && day<21){
                System.out.println("Burcunuz Oğlaktır.");
            }else if(day>20 && day<32){
                System.out.println("Burcunuz Koçtur.");
            }
        }
        else if(month==4){
            if(0<day && day<21){
                System.out.println("Burcunuz Koçtur.");
            }else if(day>20 && day<31){
                System.out.println("Burcunuz Boğadır.");
            }
        }
        else if(month==5){
            if(0<day && day<22){
                System.out.println("Burcunuz Boğadır.");
            }else if(day>21 && day<32){
                System.out.println("Burcunuz İkizlerdir.");
            }
        }
        else if(month==6){
            if(0<day && day<23){
                System.out.println("Burcunuz İkizlerdir.");
            }else if(day>22 && day<31){
                System.out.println("Burcunuz Yengeçtir.");
            }
        }
        else if(month==7){
            if(0<day && day<23){
                System.out.println("Burcunuz Yengeçtir.");
            }else if(day>22 && day<32){
                System.out.println("Burcunuz Aslandır.");
            }
        }
        else if(month==8){
            if(0<day && day<23){
                System.out.println("Burcunuz Aslandır.");
            }else if(day>22 && day<32){
                System.out.println("Burcunuz Başaktır.");
            }
        }
        else if(month==9){
            if(0<day && day<23){
                System.out.println("Burcunuz Başaktır.");
            }else if(day>22 && day<31){
                System.out.println("Burcunuz Terazidir.");
            }
        }
        else if(month==10){
            if(0<day && day<23){
                System.out.println("Burcunuz Terazidir.");
            }else if(day>22 && day<32){
                System.out.println("Burcunuz Akreptir.");
            }
        }
        else if(month==11){
            if(0<day && day<22){
                System.out.println("Burcunuz Akreptir.");
            }else if(day>21 && day<31){
                System.out.println("Burcunuz Yaydır.");
            }
        }
        else if(month==12){
            if(0<day && day<22){
                System.out.println("Burcunuz Yaydır.");
            }else if(day>21 && day<32){
                System.out.println("Burcunuz Oğlaktır.");
            }
        }
    }
}