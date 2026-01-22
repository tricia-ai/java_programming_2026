package io.github.tricia_ai.java_programming.assignments.j005;
import java.util.Scanner;

public class Assessment1_Tricia {
    public static void main(String[] args) {
        /* --------------------------------------------------------
                                  Variable Operations
        -----------------------------------------------------------*/

        System.out.println("========================= Variable Operations =========================");
        int a = 15;
        int b = 4;
        int c = 7;

        int sum = a + b + c;
        System.out.println("The sum of a, b & c: "+sum);
        int product = a *b;
        System.out.println("The product of a & b: "+product);
        int result = (a + b) * c;
        System.out.println("The result of the operation (a + b) * c: "+result);
        int modulo = a % b;
        System.out.println("The remainder when a is divided by b: "+modulo);

        /* --------------------------------------------------------
                              Grade Calculator
        -----------------------------------------------------------*/
        System.out.println("========================= Grade Calculator =========================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student score: ");
        int score = scanner.nextInt();

        //scanner.close();
        String grade;

        if (score > 100) {
            System.out.println("Error: Score must be between 0 and 100");
        } else if (score >= 90){
            grade = "A";
            System.out.println("Grade: "+grade);
        } else if (score >= 80){
            grade = "B";
            System.out.println("Grade: "+grade);
        } else if (score >= 70){
            grade = "C";
            System.out.println("Grade: "+grade);
        } else if (score >= 60){
            grade = "D";
            System.out.println("Grade: "+grade);
        } else {
            grade = "F";
            System.out.println("Grade: "+grade);
        }

        /* --------------------------------------------------------
                              Number Sequence
        -----------------------------------------------------------*/
        System.out.println("========================= Number Sequence =========================");
        for (int i = 1; i <= 20; i++){
            if (i%2 == 0){
                if (i%5 == 0){
                    System.out.println(i+" - Even, Multiple of 5");
                } else {
                    System.out.println(i+" - Even");
                }
            } else if (i%5 == 0){
                System.out.println(i+" - Odd, Multiple of 5");
            } else {
                System.out.println(i+" - Odd");
            }
        }

        /* --------------------------------------------------------
                              Input Validation
        -----------------------------------------------------------*/
        System.out.println("========================= Input Validation =========================");

        boolean isRunning = true;
        while (isRunning){
            Scanner scan = new Scanner(System.in);
            scan.nextLine();
            System.out.print("Enter a positive integer: ");
            int positiveInteger = scan.nextInt();
            int nFactorial = 1;


            if (positiveInteger < 0){
                System.out.print("Invalid input! Please enter a positive integer: ");
                scan.nextLine();
                int newPositiveInteger = scan.nextInt();
                for (int i = 1; i <= newPositiveInteger; i++){
                    nFactorial *= i;
                }
                System.out.println(nFactorial);
                isRunning = false;

            } else {
                for (int i = 1; i <= positiveInteger; i++){
                    nFactorial *= i;
                }
                System.out.println(nFactorial);
                isRunning = false;
            }
            scan.close();
        }

        /* --------------------------------------------------------
                              Pattern Printing
        -----------------------------------------------------------*/
        System.out.println("========================= Pattern Printing =========================");

        int rows = 5;
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
