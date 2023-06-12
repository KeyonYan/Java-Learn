package com.keyon.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // 初始化List的方法
        // 1. add
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        // 2. addAll
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list); // 1,2
        list2.addAll(1, list); // 1,1,2,2
        // 3.
        List<Integer> list3 = Arrays.asList(1,2,3); // 1,2,3
//        list3.add(4); // 报错，list3不可变，不能添加和删除
        // 4. 使用ArrayList包装一下，可变
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3)); // 1,2,3
        list4.add(4); // 1,2,3,4
        // 5. 使用Collections复制n个
        List<Integer> list5 = Collections.nCopies(3, 1); // 1,1,1
        // 6. 匿名内部类
        List<Integer> list6 = new ArrayList<Integer>() {{
            add(1);
            add(2);
        }}; // 1,2
        // 7. Stream
        List<Integer> list7 = Stream.of(1,2,3).collect(Collectors.toList()); // 1,2,3
    }
}
