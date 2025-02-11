package leetCodeDailyQuestions;

public class removeOccurrences1102025 {
    public static String removeOccurrences(String s, String part) {
        StringBuilder stringBuilder=new StringBuilder(s);
        while(stringBuilder.indexOf(part)!=-1){
            int index=stringBuilder.indexOf(part);
            stringBuilder=stringBuilder.delete(index,index+part.length());
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        System.out.print(removeOccurrences("axxxxyyyyb","xy"));
    }
}
