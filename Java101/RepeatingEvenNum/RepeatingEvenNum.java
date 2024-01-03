import java.util.Arrays;

public class RepeatingEvenNum {
    static boolean isFind(int[] arr,int value){
        for(int i:arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {3,2,2,4,4,5,6,7,8,9,9,7,8,0,0,0,20,34,34,20,22,33,11,25,34};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length ; j++) {
                if(i!=j && (list[i]==list[j])){
                    if(!isFind(duplicate,list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for(int value : duplicate){
            if(value != 0 && value%2 == 0){
                System.out.println(value);
            }
        }
    }
}
