package challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheWinner {
    public static void main(String[] args) {
        int n=5,k=2;
        List<Integer>list= new ArrayList<>();
        for(int i=1;i<=n;i++) list.add(i);
        int index=0;
        while(list.size()>1){
            index=(index+k-1)% list.size();
            list.remove(index);
        }
        System.out.println(list.get(0));
    }
}
