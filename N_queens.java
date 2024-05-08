public class N_queens {
    public static boolean issafe(char board [][],int row,int col){
        //for up
        for (int i=row-1;i>=0;i--){
            if (board[i][col]== 'Q'){
                return false;
            }
        }
        //for left up
        for (int i=row-1,j=col-1;j>=0 && i>=0;i--,j--){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        //for right up
        for (int i=row-1,j=col+1;j<board.length && i>=0;i--,j++){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void Nqueens(char board[][],int row){
        if (row == board.length){
            printboard(board);
            return;
        }
        for (int j=0;j<board.length;j++){
            if (issafe(board,row,j)){
                board[row][j]='Q';
                Nqueens(board, row+1);
                board[row][j]='X';   //backtracking step
            }
            
        }
    }
    public static void printboard(char board[][]){
        System.out.println("----------chess board---------");
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];

        //initialize
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board.length;j++){
                board[i][j]='X';
            }
        }
        Nqueens(board,0);


    }
}
