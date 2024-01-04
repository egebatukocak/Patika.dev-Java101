import java.util.*;
import java.lang.*;
public class MineSweeper {
        int col;
        int row;
        int mineNum;
        String[][] gameBoard;
        String[][] mineLocation;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        MineSweeper(int row,int col){
            this.col = col;
            this.row = row;
            this.gameBoard = new String[row][col];
            this.mineLocation = new String[row][col];
            this.mineNum =(int)((row*col)/5);
        }
        public void buildGameBoard(){
            for (int i = 0; i < gameBoard.length; i++) {
                for (int j = 0; j < gameBoard[0].length; j++) {
                    gameBoard[i][j] = "  X";
                    mineLocation[i][j] = "  X";
                }
            }
        }
        public void placeMines(){
            int cols,rows;
            int count = 0;
            while(count!=mineNum){
                cols = rand.nextInt(col);
                rows = rand.nextInt(row);
                if(mineLocation[rows][cols] != "  *"){
                    mineLocation[rows][cols] = "  *";
                    count++;
                }
            }
        }
        public int isWin(){
            int openCellNum = 0;
            for (int i = 0; i < gameBoard.length; i++) {
                for (int j = 0; j < gameBoard[0].length; j++) {
                    if(gameBoard[i][j]=="  X"){
                        openCellNum++;
                    }
                }
            }
            return openCellNum;
        }
        public void run(){
            buildGameBoard();
            placeMines();
            System.out.println("Mines Location");
            printArr(mineLocation);
            int userRow,userCol;
            System.out.println("--------Game--------");
            int mineNum = 0;
            while (true){
                printArr(gameBoard);

                System.out.print("Rox axis : ");
                userRow = scan.nextInt();
                System.out.print("Col axis : ");
                userCol = scan.nextInt();

                if(userRow>=0 && userCol>=0 && userRow<= this.row && userCol<= this.col){
                    if(gameBoard[userRow][userCol] == "  -") {
                        continue;
                    }
                    if(!mineLocation[userRow][userCol].equals("  *")){
                        mineNum = checkMines(userRow,userCol);
                        gameBoard[userRow][userCol] = "  "+ mineNum + String.valueOf("");
                    }else {
                        printArr(mineLocation);
                        System.out.println("Game Over !!");
                        break;
                    }
                    if(this.mineNum == isWin()){
                        printArr(gameBoard);
                        System.out.println("You Win !!");
                        break;
                    }
                }else{
                    System.out.println("You made the wrong choice !!!");
                    continue;
                }
            }
        }

        public void printArr(String[][] arr){
            System.out.print("      ");
            for (int x = 0; x < arr.length; x++) {
                if(x > 10){
                    System.out.print("   "+x);
                }else{
                    System.out.print("   "+x);
                }
            }
            System.out.println();
            System.out.print("      ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print("   -");
            }
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
                if(i>=10){
                    System.out.print(i+"- [ ");
                }else{
                    System.out.print(i+" - [ ");
                }
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(" " + arr[i][j]);
                }
                System.out.println(" ] ");
                System.out.println();
            }
        }
        public int checkMines(int row,int col){
            int count = 0;
            int tempRow,tempCol;
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    tempRow = row + i;
                    tempCol = col + j;
                    if(tempCol >= 0 && tempRow >= 0 && tempRow < this.row && tempCol < this.col){
                        if(mineLocation[tempRow][tempCol]=="  *"){
                            count++;
                        }
                        if (mineLocation[tempRow][tempCol]!="  *" && gameBoard[tempRow][tempCol]!="  -"){
                            String en = gameBoard[tempRow][tempCol];
                            try{
                                Integer.parseInt(en);
                            }catch (NumberFormatException e){
                                gameBoard[tempRow][tempCol] = "  -";
                            }
                        }
                    }
                }
                
            }
            return count;
        }
}
