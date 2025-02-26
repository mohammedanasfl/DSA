package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreyCode {
    public static void main(String[] args) {
        System.out.println(graycode(3));

    }
    public static List<String> graycode(int n)
    {
        if(n == 1){
            return Arrays.asList("0","1");
        }
        List<String>a=graycode(n-1);
        List<String>result=new ArrayList<>();
        for(String code:a){
            result.add("0"+code);
        }
        for(int i=a.size()-1;i>=0;i--){
            result.add("1"+a.get(i));
        }
        return result;
    }
}
