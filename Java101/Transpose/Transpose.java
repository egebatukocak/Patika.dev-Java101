public class Transpose {
    public static void main(String[] args) {
        int [][] matrix = { {2,3,4},
                {5,6,4} };
        System.out.println("Before the change");
        printArray(matrix);
        System.out.println("After the change");
        change(matrix);
    }
    public static void change(int[][] matrix){
        int [][] transpose = new int[matrix[0].length][matrix.length];
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int col = 0; col < matrix[0].length; col++) {
                transpose[col][rows] = matrix[rows][col];
            }
        }
        printArray(transpose);
    }

    public static void printArray(int[][] matrix) {
        for(int[] row : matrix){
            for(int col : row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
