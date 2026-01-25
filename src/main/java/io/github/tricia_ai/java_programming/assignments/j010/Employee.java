package io.github.tricia_ai.java_programming.assignments.j010;

public class Employee {
    private String name;
    private String id;
    private int salary;

    public Employee(String name, String id, int salary){
        setName(name);
        setId(id);
        setSalary(salary);
    }
    public void setName(String name){
        if (name != null){
            this.name = name;
        } else {
            this.name = "Jane Doe";
        }
    }

    public void setId(String id){
        if (id.length() == 6){
            this.id = id;
        } else {
            this.id = "XXXX";
        }
    }

    public void setSalary(int salary){
        if (salary <= 0){
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public double calculateBonus(){
        double bonus = getSalary() * 0.05;
        return bonus;
    }

    public String displayInfo(){
        System.out.println("===================== Employee details =====================");
        return "Name: "+getName()+" ID: "+getId()+" Salary: "
                +getSalary()+" Bonus: "+calculateBonus();
    }
}

