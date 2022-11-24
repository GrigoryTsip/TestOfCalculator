package ru.netology;

import java.util.function.*;

public class Calculator {

    public static Supplier<Calculator> instance = Calculator::new;

    public BinaryOperator<Float> plus = Float::sum;

    public BinaryOperator<Float> minus = (x,y) -> x - y;
    public BinaryOperator<Float> multiply = (x,y) -> x * y;
    public BinaryOperator<Float> divide = (x,y) -> {  // в задании не было учтено, что делитель может быть нулем
        if (y != 0) return x / y;
        System.out.println("Divide by 0!");
        return (float) 0;
    };
    public UnaryOperator<Float> pow = x -> x * x;
    public UnaryOperator<Float> abs = x -> x > 0 ? x : x * -1;

    public Predicate<Float> isPositive = x -> x >= 0;

    public Consumer<String> println = System.out::println;
}
