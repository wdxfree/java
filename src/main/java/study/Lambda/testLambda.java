package study.Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class testLambda {
    public static void main(String[] args) {
        System.out.println("测试");
        List<String> list = new ArrayList<>();
        list.add("45");
        list.add("33");
        list.add("44");
        System.out.println(list.stream());


        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }
}
