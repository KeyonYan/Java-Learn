package com.keyon.functional;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        boolean flag = false;
//        FunUtil.isTrue(flag).throwMessage("flag is false");
        FunUtil.isTrueOrFalse(true).branch(
                () -> System.out.println("isTrue"),
                () -> System.out.println("isFalse")
        );
        FunUtil.isTrueOrFalse(false).branch(
                () -> System.out.println("isTrue"),
                () -> System.out.println("isFalse")
        );
        String obj = "abc";
        FunUtil.isPresent(obj).present(
                (x) -> System.out.println(x),
                () -> System.out.println("obj is null")
        );
        FunUtil.isPresent(null).present(
                (x) -> System.out.println(x),
                () -> System.out.println("obj is null")
        );
        Predicate<Integer> isOdd = x -> x % 2 != 0 ? true : false;
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6);
        arr.stream().filter(isOdd).forEach(System.out::println);

        Consumer<Integer> print = x -> System.out.println(-x);
        arr.stream().filter(isOdd).forEach(print);

        Function<Integer, String> toString = (x) -> "0" + x.toString();
        Function<String, Integer> valueOf = (x) -> Integer.valueOf(x);
        arr.stream().map(toString).forEach(System.out::println);

//        Comparator<Person> comparator = (x, y) -> x.age - y.age;
        Comparator<Person> comparator = Comparator.comparingInt(x -> x.age);
        Person p2 = new Person("bb", 2);
        Person p1 = new Person("aa", 1);
        List<Person> personArr = Arrays.asList(p1, p2);
        personArr.stream().sorted(comparator).forEach(System.out::println);
    }
}

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}