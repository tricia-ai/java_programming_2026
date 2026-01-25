package io.github.tricia_ai.java_programming.assignments.j010;

public class Developer extends Employee{
    public Developer(String name, String id, int salary){
        super(name, id, salary);
    }
    @Override
    public double calculateBonus(){
        double bonus = getSalary() * 0.10;
        return bonus;
    }
}
