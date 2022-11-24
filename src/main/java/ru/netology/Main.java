package ru.netology;

public class Main {


    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        float a = calc.plus.apply(8.0F, 2.0F);
        float b = calc.minus.apply(1F, 3F);
        calc.println.accept("a = " + a);
        calc.println.accept("b = " + b);

        b = calc.abs.apply(b);
        calc.println.accept("|b| = " + b);

        float c = calc.divide.apply(a, b);
        calc.println.accept("c = a/|b| = " + c);

        c = calc.pow.apply(c);
        calc.println.accept("c^2 = " + c);

        c = calc.multiply.apply(c,b);
        calc.println.accept("c * |b| = " + c);

    }
}