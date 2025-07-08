package string;

public class ZigzagConversion {
        public static String convert(String s, int numRows) {

            if(numRows == 1 || s.length()<=numRows) return  s;

            StringBuilder [] stringBuilders=new StringBuilder[numRows];

            for(int i=0;i<numRows;i++){
                stringBuilders[i]=new StringBuilder();
            }
            int currentRow=0;
            boolean onGoingRow=false;

            for(char c:s.toCharArray()){
                stringBuilders[currentRow].append(c);

                if(currentRow ==0 || currentRow == numRows-1){
                    onGoingRow=!onGoingRow;
                }
                currentRow+=onGoingRow?1:-1;
            }
            StringBuilder result=new StringBuilder();
            for(StringBuilder str: stringBuilders) result.append(str);

            return result.toString();
        }
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",4));
    }
    }




