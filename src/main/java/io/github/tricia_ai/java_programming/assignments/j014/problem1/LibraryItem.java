package io.github.tricia_ai.java_programming.assignments.j014.problem1;

import java.util.Scanner;

public class LibraryItem {
    protected String itemId;
    protected String title;
    protected String author;
    protected boolean isAvailable;

    public LibraryItem(String itemId, String title, String author){
        this(itemId, title, author, true);
    }

    public LibraryItem(String itemId, String title, String author, boolean isAvailable) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void checkout(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Would you like to borrow an item? (Yes or No): ");
        String reply = scan.nextLine();
        boolean input = true;

        while (input) {
            if (reply.equals("Yes")) {
                System.out.print("Enter book name: ");
                String bookName = scan.nextLine();
                if (getTitle().equals(bookName)) {
                    System.out.println("Yes the item is available, you can borrow it");
                } else {
                    System.out.println("The item is not available");
                }
                input = false;
            } else if (reply.equals("No")) {
                System.out.println("Maybe next time. Happy to serve");
                input = false;

            } else {
                System.out.println("Kindly try again with the correct format");
                System.out.print("Would you like to borrow an item? (Yes or No): ");
                reply = scan.nextLine();

                input = true;
            }
        }
    }
    public void returnItem(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Would you like to return an item? (Yes or No): ");
        String reply = scan.nextLine();
        boolean input = true;
        while (input){
            if (reply.equalsIgnoreCase("Yes")){
                System.out.println("============ Enter item details ============");
                System.out.println("Enter the title");
                String bookTitle = scan.nextLine();
                System.out.println("Enter the author");
                String bookAuthor = scan.nextLine();
                System.out.println("Enter the ID");
                String bookID = scan.nextLine();

                LibraryItem bookReturned = new LibraryItem(bookID, bookTitle, bookAuthor);
                System.out.println("===================== Details of the returned item =====================");
                System.out.println("Magazine title: "+bookReturned.getTitle()+" Magazine author: "+bookReturned.getAuthor()+" Magazine ISBN: "
                        +bookReturned.getItemId()+" Availability: "+getIsAvailable());
                input = false;

            } else if (reply.equalsIgnoreCase("No")){
                System.out.println("Maybe next time. Happy to serve");
                input = false;
            } else {
                System.out.println("Kindly try again with the correct format");
                System.out.print("Would you like to return a book? (Yes or No): ");
                reply = scan.nextLine();

                input = true;

            }
        }




        scan.close();

    }
    public String displayDetails(){
        System.out.println("===================== Details of the item =====================");
        return "Item title: "+getTitle()+" Item Author: "+getAuthor()+" Item ID: "+getItemId()+" Availability: "
                +getIsAvailable();
    }
}


class Book extends LibraryItem{
    private String isbn;
    private String genre;

    public Book(String itemId, String title, String author, String isbn, String genre){
        super(itemId, title, author);
        this.isbn = isbn;
        this.genre = genre;

    }

    public String getIsbn() {
        return isbn;
    }

    public String getGenre() {
        return genre;
    }


    @Override
    public void checkout() {
        super.checkout();
    }

    @Override
    public void returnItem() {
        super.returnItem();
    }

    @Override
    public String displayDetails() {
        return super.displayDetails() + "Book ISBN: "+getIsbn()+" Book Genre: "+getGenre();
    }
}

class DVD extends LibraryItem{
    private int duration;
    private String rating;

    public DVD(String itemId, String title, String author, int duration, String rating){
        super(itemId, title, author);
        this.duration = duration;
        this.rating = rating;

    }

    public int getDuration() {
        return duration;
    }

    public String getRating() {
        return rating;
    }


    @Override
    public void checkout() {
        super.checkout();
    }

    @Override
    public void returnItem() {
        super.returnItem();
    }

    @Override
    public String displayDetails() {
        return super.displayDetails() + "DVD Duration: "+ getDuration()+" DVD Genre: "+ getRating();
    }
}

class Magazine extends LibraryItem{
    private int issueNumber;
    private String publicationDate;

    public Magazine(String itemId, String title, String author, int issueNumber, String publicationDate){
        super(itemId, title, author);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;

    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public String getPublicationDate() {
        return publicationDate;
    }


    @Override
    public void checkout() {
        super.checkout();
    }

    @Override
    public void returnItem() {
        super.returnItem();
    }

    @Override
    public String displayDetails() {
        return super.displayDetails() + "Magazine Duration: "+ getIssueNumber()+" Magazine Genre: "+ getPublicationDate();
    }
}

