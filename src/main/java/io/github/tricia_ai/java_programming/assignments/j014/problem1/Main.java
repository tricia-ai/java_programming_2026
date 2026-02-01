package io.github.tricia_ai.java_programming.assignments.j014.problem1;

public class Main {

    public static void main(String[] args) {
        LibraryItem[] items = {
                new Book("B001", "Java Programming", "John Doe", "123-4567890123", "Education"),
                new DVD("D001", "Java Tutorial", "Jane Smith", 120, "PG"),
                new Magazine("M001", "Tech Monthly", "Tech Press", 15, "2024-03-01")
        };
        for (LibraryItem item : items) {
            System.out.println(item.displayDetails());
        }
    }
}
