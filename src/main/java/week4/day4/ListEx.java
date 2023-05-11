package week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List l1 = new ArrayList(); // 메모리를 많이 사용하고 일관적으로 사용 불가능
        List<Integer> l2 = new ArrayList<Integer>(); // 타입 지정
        l1.add("Hello");
        l1.add(1);
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
        //l1.remove(0);
        //l1.remove(0);
        System.out.println(l1.isEmpty());
        for(var item : l1) { //for each
            System.out.println(item);
        }
    }
}
