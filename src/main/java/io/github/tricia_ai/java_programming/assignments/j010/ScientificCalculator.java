package io.github.tricia_ai.java_programming.assignments.j010;

public class ScientificCalculator extends Calculator{
    @Override
    public int add(int a, int b){
        return a + b;
    }
    public double power(double base, double exponent){
        double result = 1;
        for (int i = 1; i <= exponent; i++){
           result *= base;
        }
        return result;

    }

    public double square (double num){
        return num * num;
    }
}
