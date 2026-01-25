package io.github.tricia_ai.java_programming.assignments.j010;

public class ScientificCalculator extends Calculator{
    public ScientificCalculator(){
        displayInfo();
    }

    @Override
    public int add(int a, int b){
        int result = a + b;
        System.out.print("The result of the addition of the two integers: ");
        return result;
    }
    public double power(double base, double exponent){
        double result = 1;
        for (int i = 1; i <= exponent; i++){
           result *= base;
        }
        System.out.println("The power of the base: "+base+" and the exponent: "+exponent);
        return result;

    }

    public double square (double num){
        System.out.println("The square of the number: ("+num+") :" );
        return num * num;
    }
    @Override
    public void displayInfo(){
        System.out.println("=========== =============== ============");
        System.out.println(add(5,7));
        System.out.println("=========== =============== ============");
        System.out.println(add(4,2));
        System.out.println("=========== =============== ============");
        System.out.println(add(1,11, 5));
        System.out.println("=========== =============== ============");
        System.out.println(add("HAPPY ","SUNDAY!"));
        System.out.println("=========== =============== ============");
        System.out.println(power(2,4));
        System.out.println("=========== =============== ============");
        System.out.println(square(2));
    }

}
