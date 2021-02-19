import java.util.Scanner;

public class Books
{
    private String nameBook, author;
    private int bookNumber;
    public Books()
    {
        this.nameBook = "***";
        this.author = "***";
        this.bookNumber = 0;
    }
    public Books(String nameBook, String author, int amount, int bookNumber)
    {
        this.nameBook = nameBook;
        this.author = author;
        this.bookNumber = bookNumber;
    }
    public void setNameBook(String nameBook)    {this.nameBook = nameBook;}
    public void setAuthor(String author)        {this.author = author;}
    public void setBookNumber(int bookNumber)   {this.bookNumber = bookNumber;}
    public String getNameBook()                 {return nameBook;}
    public String getAuthor()                   {return author;}
    public int getBookNumber()                  {return bookNumber;}
    
    public Scanner sc = new Scanner(System.in);
    public void BookInformation()
    {
        System.out.print("Please enter the name of the book: ");
        nameBook = sc.nextLine();
        System.out.print("Please enter the name of the author of the book: ");
        author = sc.nextLine();
        System.out.print("Please enter the number of book: ");
        bookNumber = sc.nextInt();
    }
    public void PrintBook()
    {
        System.out.print("Name book: " + nameBook + "   ");
        System.out.print("Author: " + author + "   ");
        System.out.println("Book Number: " + bookNumber);
        System.out.println("_____________________________");
    }
}
