package leetCodeDailyQuestions;

public class PartitionString {
    public static int partitionString(String s) {
        int count=1;
        StringBuilder str=new StringBuilder();
        for(char c:s.toCharArray()){
            if(str.indexOf(String.valueOf(c))==-1){
                str.append(c);
                continue;
            }
            count++;
            str=new StringBuilder();
            str.append(c);

        }
        return  count;
    }

    public static void main(String[] args) {
        System.out.println(partitionString("sssss"));
    }
}
