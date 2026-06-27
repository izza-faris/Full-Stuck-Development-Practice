// Abstract Class
abstract class Libraryitem{
    abstract void displayInfo();
}

// Interface
interface Borrowable{
    void borrowitem();

    void returnitem();
}

class Person{
  String Name;
  int Age;

}
class Student extends Person implements Borrowable{
   @Override
   public void  borrowitem(){
    System.out.println(Name + " Borrowed a book ");
   }
   @Override
   public void  returnitem(){
    System.out.println(Name + " returned a book ");
   }
   


}

class Librarian extends Person {
 void manageLibrary(){
    System.out.println(Name + " is managing the library.");
 }
}


class Book extends Libraryitem implements Borrowable{
    
   private int bookid;
   private String title;
   private String author;
   private double price;

   public int getBookid() {
    return bookid;
   }
   public void setBookid(int bookid) {
    this.bookid = bookid;
   }
   public String getTitle() {
    return title;
   }
   public void setTitle(String title) {
    this.title = title;
   }
   public String getAuthor() {
    return author;
   }
   public void setAuthor(String author) {
    this.author = author;
   }
   public double getPrice() {
    return price;
   }
   public void setPrice(double price) {
    this.price = price;
   }



    @Override
    void displayInfo(){
     System.out.println("Book ID: " + bookid);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
    @Override
    public void borrowitem(){
        System.out.println("Book borrowed successfully.");
    }
     
    @Override
    public void returnitem(){
        System.out.println("Book returned successfully.");
    }
}

public class LibraryManag{
    public static void main(String[] args) {

        Book b1= new Book();
        
        b1.setBookid(101);
        b1.setTitle("Harry Potter");
        b1.setAuthor("J. K. Rowling");
        b1.setPrice(3500);

        System.out.println("\n======Book Details=====\n");
       b1.displayInfo();

       System.out.println();

       Student s1= new Student();
        s1.Name= "Izza";
        s1.Age= 21;

        Librarian l1= new Librarian();
        l1.Name ="Seetha";
        

        System.out.println("Student Name:  " +  s1.Name);
        System.out.println("Student Age:  " + s1.Age);

        System.out.println();

        System.out.println("Librarian Name: "+ l1.Name);
        

         System.out.println();


           // Polymorphism
        Libraryitem item = new Book();

        Book b2 = (Book) item;
        b2.setBookid(102);
        b2.setTitle("The Little Prince");
        b2.setAuthor("Antoine de Saint-Exupéry");
        b2.setPrice(4000);

        System.out.println("===== POLYMORPHISM =====");
        item.displayInfo();

        System.out.println();
       

         // Interface

         System.out.println("===Book Borrow===");
          b1.borrowitem();
          b1.returnitem();

          System.out.println();

          System.out.println("===Student Borrow===");
          s1.borrowitem();
          s1.returnitem();

          System.out.println();

        System.out.println("===== LIBRARIAN =====");
        l1.manageLibrary();

         
    }
}
