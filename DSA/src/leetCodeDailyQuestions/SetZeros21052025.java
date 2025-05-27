package leetCodeDailyQuestions;

public class SetZeros21052025{
    public static void main(String[] args) {
        int [][] matrix={
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };

        int row =matrix.length;
        int col=matrix[0].length;

        boolean firstRow=false;
        boolean firstCol=false;

        for(int i=0;i<col;i++){
            if(matrix[0][i]==0){
                firstCol=true;
                break;
            }
        }
        for(int i=0;i<row;i++){
            if(matrix[i][0]==0){
                firstRow=true;
                break;
            }
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1;i<row;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<col;j++){
                    matrix[i][j]=0;
                }
            }
        }

        for(int i=1;i<col;i++){
            if (matrix[0][i] == 0) {
                for(int j=1;j<row;j++){
                    matrix[j][i]=0;
                }
            }
        }

        if(firstRow){
            for(int i=0;i<col;i++){
                matrix[0][i]=0;
            }
        }
        if(firstCol){
            for(int i=0;i<row;i++){
                matrix[i][0]=0;
            }
        }









        for(int []i:matrix){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
