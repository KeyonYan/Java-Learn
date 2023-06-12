package com.keyon.strategy;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter p) {
        for (Apple apple : inventory) {
            String output = p.accept(apple);
            System.out.println(output);
        }
    }

    public static List<Apple> filterApple(List<Apple> inventory, ApplePredicate p) {
        List<Apple> filterApples = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.accept(apple)) {
                filterApples.add(apple);
            }
        }
        return filterApples;
    }

    public static List<Apple> filterTemplate(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> filterApples = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.accept(apple)) {
                filterApples.add(apple);
            }
        }
        return filterApples;
    }

    public static void main(String[] args) {
        List<Apple> inventory = Stream.of(
                new Apple(90, "green"),
                new Apple(90, "red"),
                new Apple(150, "red"))
                .collect(Collectors.toList());
        prettyPrintApple(inventory, new AppleSimpleFormatter());
        prettyPrintApple(inventory, new AppleFancyFormatter());

        List<Apple> filterApples = filterTemplate(inventory, (Apple apple) -> "red".equals(apple.getColor()));
        System.out.println(filterApples);
    }
}
