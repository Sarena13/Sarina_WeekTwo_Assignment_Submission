/* Book Library (Manual Objects) Create a Book class with attributes: title, author, 
ISBN. In the main() method, create 5 different Book objects manually and display 
their details using a method showDetails(). */

public class Book{

    public String title;
    public String author;
    public int ISBN;

    public Book(String ti, String au, int IS){
        this.title = ti;
        this.author = au;
        this.ISBN = IS;
    }
         
        
         public void showDetails(){
            System.out.println("Title: "+ this.title);
            System.out.println("Author: "+ this.author);
            System.out.println("ISBN: "+ this.ISBN);
         }
         
         public static void main (String[] args){
            Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 11222);//Book 1 is  object and book is a class//
            Book book2 = new Book("Linear Alegbra", "Gilbert strang", 123);
            Book book3 =new Book("one Piece", "Oda", 12333);
            Book book4 =new Book("The power of Subconsious Mind", "xyz", 1233);
            Book book5 =new Book("xxxx", "O", 1333);
            book1.showDetails();
            book2.showDetails();
            book3.showDetails();
            book4.showDetails();
            book5.showDetails();
            
         
         }
    }
