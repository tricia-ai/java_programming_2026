package io.github.tricia_ai.java_programming.assignments.j010;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int price;
    private boolean isAvailable;

    public Book(String title, String author, String isbn){
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        this.isAvailable = true;
    }
    public Book(String title, String author, String isbn, int price, boolean isAvailable){
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setPrice(price);
        this.isAvailable = isAvailable;
    }

    public void setTitle(String title){
        if (title != null){
            this.title = title;
        } else {
            this.title = "Enter a title";
        }
    }

    public void setAuthor(String author){
        if (author != null){
            this.author = author;
        } else {
            this.author = "Enter the author of the book";
        }
    }

    public void setIsbn(String isbn){
        if (isbn.length() == 13){
            this.isbn = isbn;
        } else {
            this.isbn = "Not a valid ISBN number";
        }
    }

    public void setPrice(int price){
        if (price > 0){
            this.price = price;
        } else {
            this.price = 0;
        }
    }


    public boolean getIsAvailable(){
        return isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        System.out.println("===================== Details of the book =====================");
        return "Book title: "+getTitle()+" Book Author: "+getAuthor()+" Book ISBN: "+getIsbn()+" Availability "
                +getIsAvailable()+" Price: "+getPrice();
    }

    public void borrowBook(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Would you like to borrow a book? (Yes or No): ");
        String reply = scan.nextLine();
        boolean input = true;

        while (input) {
            if (reply.equals("Yes")){
                System.out.print("Enter book name: ");
                scan.nextLine();
                String bookName = scan.nextLine();
                if (getTitle().equals(bookName)){
                    System.out.println("Yes the book is available, you can borrow it");
                } else {
                    System.out.println("The book is not available");
                }
                input = false;
            } else if (reply.equals("No")) {
                System.out.println("Maybe next time. Happy to serve");
                input = false;

            } else {
                System.out.println("Kindly try again with the correct format");
                System.out.print("Would you like to borrow a book? (Yes or No): ");
                reply = scan.nextLine();

                input = true;
            }
        }



    }

    public void returnBook(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Would you like to return a book? (Yes or No) ");
        String reply = scan.nextLine();
        boolean input = true;
        while (input){
            if (reply.equals("Yes")){
                System.out.println("============ Enter book details ============");
                System.out.println("Enter the book title");
                String bookTitle = scan.nextLine();
                System.out.println("Enter the book author");
                String bookAuthor = scan.nextLine();
                System.out.println("Enter the book ISBN");
                String bookISBN = scan.nextLine();

                Book bookReturned = new Book(bookTitle, bookAuthor, bookISBN);
                System.out.println("===================== Details of the returned book =====================");
                System.out.println("Book title: "+bookReturned.getTitle()+" Book author: "+bookReturned.getAuthor()+" Book ISBN: "
                        +bookReturned.getIsbn()+" Availability: "+getIsAvailable());
                input = false;

            } else if (reply.equals("No")){
                System.out.println("Maybe next time. Happy to serve");
                input = false;
            } else {
                System.out.println("Kindly try again with the correct format");
                System.out.print("Would you like to return a book? (Yes or No) ");
                reply = scan.nextLine();

                input = true;

            }
        }




        scan.close();
    }

}
