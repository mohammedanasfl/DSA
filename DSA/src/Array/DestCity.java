package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestCity {
    public static void main(String[] args) {
        List<List<String>>list=new ArrayList<>();
        list.add(List.of("London","New York"));
        list.add(List.of("New York","Lima"));
        list.add(List.of("Lima","Sao Paulo"));
        System.out.println(destCity(list));
    }
    public static String destCity(List<List<String>> paths) {
        Set<String>set=new HashSet<>();
        for(List<String>i:paths){
            set.add(i.get(0));
        }
        for(List<String>i:paths){
            if(!set.contains(i.get(1))){
                return i.get(1);
            }
        }
        return " ";
    }
}
