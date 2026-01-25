package io.github.tricia_ai.java_programming.exercises.j006;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    //made it a class variable to make it accessible to all classes
    public static int[] scores;
    public static void main(String[] args) {
        scores = studentGrades(5);
        printGradeReport();


    }
    public static int[] studentGrades(int values){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grades: ");
        int[] grades = new int[values];
        for (int i = 0; i<grades.length; i++){
            grades[i] = scan.nextInt();
        }
        //scan.close();
        return grades;
    }
    public static double calculateAverage(){
        int sum = 0;
        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        double average = (double) sum / scores.length;
        return average;

    }
    public static int findHighestGrade(){
        int highest = scores[0];
        for (int i = 0; i < scores.length; i++){
            if (scores[i] >= highest){
                highest = scores[i];
            }
        }
        return highest;
    }
    public static int findLowestGrade(){
        int lowest = scores[0];
        for (int i = 0; i < scores.length; i++){
            if (scores[i] <= lowest){
                lowest = scores[i];
            }
        }
        return lowest;

    }
    public static String getGradeLetter(){
        double calculated_average = calculateAverage();
        String letter;
        if (calculated_average >= 90) {
            letter = "A";
        } else if (calculated_average >= 80) {
            letter = "B";
        } else if (calculated_average >= 70) {
            letter = "C";
        } else if (calculated_average >= 60) {
            letter = "D";
        } else if (calculated_average >= 50) {
            letter = "E";
        } else {
            letter = "F";
        }
        return letter;


    }
    public static void printGradeReport(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String names = scanner.nextLine();
        scanner.close();

        System.out.println("Student: "+names);
        System.out.println("Grades: "+ Arrays.toString(scores));
        System.out.println("Average: "+calculateAverage()+ "("+getGradeLetter()+")");
        System.out.println("Highest: "+findHighestGrade()+", Lowest: " +findLowestGrade());
    }


}
