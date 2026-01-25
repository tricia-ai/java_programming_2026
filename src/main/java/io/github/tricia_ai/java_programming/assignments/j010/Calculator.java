package io.github.tricia_ai.java_programming.assignments.j010;

public class Calculator {
    public Calculator(){
        displayInfo();
    }


    public int add(int a, int b){
        System.out.print("The addition of two integers "+a+" and "+b);
        return a + b;
    }
    public double add(double a, double b){
        System.out.print("The addition of two doubles "+a+" and "+b);
        return a + b;
    }
    public int add(int a, int b, int c){
        System.out.print("The addition of three integers "+a+", "+b+" and "+c);
        return a + b + c;
    }
    public String add(String a, String b){
        System.out.print("The addition of two strings "+a+" and "+b);
        return a + b;
    }
    public void displayInfo(){
        System.out.println("=========== =============== ============");
        System.out.println(add(1,2));
        System.out.println("=========== =============== ============");
        System.out.println(add(1,2));
        System.out.println("=========== =============== ============");
        System.out.println(add(1,2, 5));
        System.out.println("=========== =============== ============");
        System.out.println(add("ADD","ITION"));
    }
}
