/* Class Initialization through Constructor Create a class Book with attributes 
title and author. Initialize them using a constructor, and print the details using 
a method showBook().*/

public class Book {
    public String title;
    public String author;

    public Book ( String title, String author){
        this.title= title;
        this.author= author;
    }
    public void showBook(){
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println();
    }
    public static void main ( String[] args){
        Book B1 = new Book("The power of Subconcious Mind","Joseph Murphy");
        Book B2 = new Book ("Rich Dad Poor Dad", "Robert Kiyosaki");

        B1.showBook();
        B2.showBook();
    }

    }
    
