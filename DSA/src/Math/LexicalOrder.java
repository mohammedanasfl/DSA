package Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LexicalOrder {
    public static List<Integer> lexicalOrder(int n) {
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<=n;i++) list.add(i);

        Collections.sort(list, (o1, o2) -> String.valueOf(o1).compareTo(String.valueOf(o2)));
        return list;

    }


    public static void main(String[] args) {
        System.out.println(lexicalOrder(13));
    }
}
