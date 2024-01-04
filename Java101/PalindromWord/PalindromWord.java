import java.util.Scanner;

public class PalindromWord {
    static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sorgulanacak kelimeyi giriniz : ");
        String word = scan.nextLine();
        if(isPalindrome(word)){
            System.out.println(word + " kelimesi palindromik bir kelimedir.");
        }
        else{
            System.out.println(word + " kelimesi palindromik bir kelime değildir.");
        }
    }
}
