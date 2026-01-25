package io.github.tricia_ai.java_programming.assignments.j010;

public class Assessment2_Tricia {
    public static void main(String[] args) {
        /*
        *
        *
        * Class Design and Encapsulation
        *
        * */
        System.out.println("/////////////////////// Class Design and Encapsulation ///////////////////////");
        Book book1 = new Book("I Am Pilgrim","Terry Hayes","ISB0978234939",200,true);
        System.out.println(book1);
        book1.borrowBook();
        book1.returnBook();

        /*
         *
         *
         *  Inheritance Hierarchy
         *
         * */
        System.out.println("============================ Inheritance Hierarchy ============================");
        System.out.println();
        Employee emp1 = new Employee("Stacey Mwikali","HRSM98", 200000);
        System.out.println(emp1.displayInfo());

        Manager man1 = new Manager("Susan Nzau","TMSN01", 300000);
        System.out.println(man1.displayInfo());

        Developer dev1 = new Developer("Tricia Nyoike","DVTN01", 250000);
        System.out.println(dev1.displayInfo());

        /*
         *
         *
         *  Method Overloading and Overriding
         *
         * */
        System.out.println("============================ Method Overloading and Overriding ============================");
        Calculator calc = new Calculator();
        ScientificCalculator scif = new ScientificCalculator();

        /*
         *
         *
         *  Inheritance
         *
         * */
        System.out.println();
        BankAccount bank1 = new BankAccount("224564065", "Stacey", 90000);
        bank1.displayInfo();
        bank1.deposit(200000);
        bank1.withdraw(500);


        System.out.println();
        System.out.println("============================ Savings Account ============================");
        SavingsAccount savings1 = new SavingsAccount("224564070", "Joshua", 90000, 20000);
        savings1.displayInfo();
        System.out.println(savings1.withdraw(2000));
        System.out.println(savings1.savingsInterest(10));


        System.out.println();
        System.out.println("============================ Inheritance Checking Account============================");
        CheckingAccount check1 = new CheckingAccount("224464068", "Joel", 90000);
        check1.displayInfo();
        check1.deposit(250000);



        /*
        * Quiz Problem 5: Conceptual Questions
        Answer the following questions with code examples:
        1. What is the difference between method overloading and method overriding?
        * Method overloading occurs when methods have different method signatures while overriding refers to changing or
        * altering the functioning of an inherited method and uses the @Override keyword
        2. Why should fields be declared private in a class?
        * Fields that should not be accessed by the public
        3. When should you use the super keyword?
        * When access a parent class constructor
        4. What is the purpose of the @Override annotation?
        * Indicates the intention of changing or altering the functioning of an inherited method
        5. How does encapsulation improve code maintainability?
        * It enables restriction of private fields thus maintaing integrity
        *
        *
        *
        * */



    }
}

