public class AsalSayiYazma {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            int control=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    control=1;
                    break;
                }
            }
            if(control==0){
                System.out.print(i+" ");
            }
        }
    }
}