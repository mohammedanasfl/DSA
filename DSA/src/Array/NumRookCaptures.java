package Array;

public class NumRookCaptures {
    public static void main(String[] args) {
        char[][] board = {
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'R', '.', '.', '.', 'p'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };

        System.out.println(numRookCaptures(board));

    }
    public static int numRookCaptures(char[][] board) {
        int count=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='R'){
                    count+=checkFrontDown(board,i,board.length,j);
                    count+=checkFrontRight(board,j,board.length,i);
                    count+=checkBackUp(board,i,0,j);
                    count+=checkBackLeft(board,j,0,i);
                }
            }
        }
        return count;
    }
    static int checkFrontRight(char[][] board, int start, int end, int row){
        for(int i=start+1;i<end;i++){
            if(board[row][i]=='B') break;
            else if(board[row][i]=='p') return 1;
        }
        return 0;

    }
    static int checkFrontDown(char[][] board, int start, int end, int col){
        for(int i=start+1;i<end;i++){
            if(board[i][col]=='B') break;
            else if(board[i][col]=='p') return 1;
        }
        return 0;

    }
    static int checkBackUp(char[][] board, int start, int end, int col){
        for(int i=start-1;i>=end;i--){
            if(board[i][col]=='B') break;
            else if(board[i][col]=='p') return 1;
        }
        return 0;

    }
    static int checkBackLeft(char[][] board, int start, int end, int row){
        for(int i=start-1;i>=end;i--){
            if(board[row][i]=='B') break;
            else if(board[row][i]=='p') return 1;
        }
        return 0;

    }
}
