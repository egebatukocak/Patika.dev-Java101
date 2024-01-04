import java.util.Arrays;

public class ArrayRepeatingNum {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(array1));
        int[] frequencies = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            if (frequencies[i] == -1) {
                continue;
            }
            int element = array1[i];
            int frequency = 1;
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[j] == element) {
                    frequency++;
                    frequencies[j] = -1;
                }
            }
            frequencies[i] = frequency;
        }
            System.out.println("Tekrar Sayıları");
            for (int i = 0; i < array1.length; i++) {
                if (frequencies[i] != -1) {
                    System.out.println(array1[i] + " sayısı " + frequencies[i] + " kez tekrarlandı. ");
                }
            }
        }
    }

