import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int NumOfCustomer = 0, NumOfBook = 0, NumOfBookBorrow = 0, Selection = 0, countBook = 0, 
        countCustomer = 0, countBookScience = 0, countBookSocial = 0;
        boolean Condition = true;
        String BookName, AuthorName;
        CreateAccount listAccount[] = new CreateAccount[10000]; 
        Books listBooksBorrow[] = new Books[10000];
        Books listBookScience[] = new  Books[10000];
        Books listBookSocial[] = new Books[10000];
        while(Condition)
        {
            System.out.println("1.Enter information and register account of the customer\n" 
                    + "2.Print the information of the customer\n"
                    + "3.See some typical books\n"
                    + "4.Borrow books\n" 
                    + "5.Enter the information of the book\n"
                    + "6.Print the information of the book\n"
                    + "7.Search for books by title or by author\n"
                    + "Enter other numbers to exit");
            System.out.print("What do you choose to do: ");
            Selection = sc.nextInt();
            switch (Selection)
            {
                case 1:
                    System.out.print("Please enter the number of customers: ");
                    NumOfCustomer = sc.nextInt();
                    for (int i = countCustomer; i < NumOfCustomer; i++) 
                    {
                        System.out.println("customer " + (i+1));
                        listAccount[i] = new CreateAccount();
                        listAccount[i].Information();
                        countCustomer++;
                    }
                    break;
                    
                case 2:
                    System.out.println("All customer information is as follows: ");
                    for(int i = 0; i < NumOfCustomer; i++)
                    {
                        System.out.println("customer " + (i+1) + ":");
                        listAccount[i].PrintInformation();
                    }
                    break;
                    
                case 3:
                    System.out.println("1. Pride and Prejudice – Jane Austen\n" 
                    + "2. The Lord of the Rings – JRR Tolkien\n"
                    + "3. Jane Eyre – Charlotte Bronte\n"
                    + "4. Harry Potter series – JK Rowling\n"
                    + "5. To Kill a Mockingbird – Harper Lee\n"
                    + "6. The Bible (Kinh Thanh)\n"
                    + "7. Wuthering Heights – Emily Bronte\n"
                    + "8. Nineteen Eighty Four – George Orwell\n"
                    + "9. His Dark Materials – Philip Pullman\n"
                    + "10. Great Expectations – Charles Dickens\n");
                    break;
                    
                case 4:
                    System.out.print("Enter the number of books you want to borrow: ");
                    NumOfBookBorrow = sc.nextInt();
                    for(int i = 0; i < NumOfBookBorrow; i++)
                    {
                        System.out.println("Please enter book information " + (i + 1) + ":");
                        listBooksBorrow[i] = new Books();
                        listBooksBorrow[i].BookInformation();
                    }
                    System.out.println("Congratulations! You have successfully borrowed the book\n" + 
                    "Borrowing period is seven days, Please return the book on time");
                    System.out.println("**********************************************");
                    break;
                    
                case 5:
                    System.out.print("Please enter the number of books: ");
                    NumOfBook = sc.nextInt();
                    for(int i = 0; i < NumOfBook ; i++)
                    {
                        System.out.println("Please select a book category: \n" + "1. Science books\n" 
                        +"2. Social book\n" + "Enter other numbers to exit");
                        int mode = sc.nextInt();
                        if(mode == 1)
                        {
                            listBookScience[countBookScience] = new Books();
                            listBookScience[countBookScience].BookInformation();
                            countBookScience ++;
                        }
                        else if(mode == 2)
                        {
                            listBookSocial[countBookSocial] = new Books();
                            listBookSocial[countBookSocial].BookInformation();
                            countBookSocial ++;
                        }
                        else
                        {
                            break;
                        }
                    }
                    System.out.println("Congratulations!, you have successfully entered your book information!");
                    System.out.println("<> <> <> <> <> <> <> <> <> <> <> <> <> <> <> <> <> <> <> <> <> <> <> <> <>");
                    break;
                    
                case 6:
                    System.out.println("What kind of books do you want to print: \n" + "1. Science books\n" 
                    +"2. Social book\n" + "3.See all books\n" + "Enter other numbers to exit" );
                    int mode = sc.nextInt();
                    if(mode == 1)
                    {
                        System.out.println("Information of science books is:");
                        for(int i = 0; i < NumOfBook ; i++)
                        {
                            System.out.println(i+1);
                            listBookScience[i].PrintBook();
                            System.out.println("############################");
                        }
                    }
                    else if(mode == 2)
                    {
                        System.out.println("Information of social books is:");
                        for(int i = 0; i < NumOfBook ; i++)
                        {
                            System.out.println(i+1);
                            listBookSocial[i].PrintBook();
                            System.out.println("############################");
                        }
                    }
                    else if(mode == 3)
                    {
                        System.out.println("Information of science books is:");
                        for(int i = 0; i < NumOfBook ; i++)
                        {
                            System.out.println(i+1);
                            listBookScience[i].PrintBook();
                            System.out.println("############################");
                        }
                        System.out.println("Information of social books is:");
                        for(int i = 0; i < NumOfBook ; i++)
                        {
                            System.out.println(i+1);
                            listBookSocial[i].PrintBook();
                            System.out.println("############################");
                        }
                    }
                    else
                    {
                        break;
                    }
                    break;
                    
                case 7:
                    System.out.println("What kind of books do you want to print: \n" + "1. Science books\n" 
                    + "2. Social book\n" + "Enter other numbers to exit");
                    int mode7 = sc.nextInt();
                    if(mode7 == 1)
                    {
                        System.out.println("Search for books by: \n" + "1. title \n" + "2. author\n" + "Enter other numbers to exit");
                        int mode1 = sc.nextInt();
                        if(mode1 == 1)
                        {
                            System.out.print("Please enter the name of the book you want to search: ");
                            BookName = sc.next();
                            countBook = 0;
                            for(int i = 0; i < countBookScience; i++)
                            {
                                if(listBookScience[i].getNameBook().equals(BookName))
                                {
                                    listBookScience[i].PrintBook();
                                    countBook ++;
                                }
                            }
                            if(countBook == 0)
                            {
                                System.out.println("The book with the name you entered cannot be found");
                            }
                            
                        }
                        else if(mode1 == 2)
                        {
                            System.out.print("Please enter the author of the book you want to search: ");
                            AuthorName = sc.next();
                            countBook = 0;
                            for(int i = 0; i < countBookScience; i++)
                            {
                                if(listBookScience[i].getAuthor().equals(AuthorName))
                                {
                                    listBookScience[i].PrintBook();
                                    countBook ++;
                                }
                            }
                            if(countBook == 0)
                            {
                                System.out.println("The book with the author you entered cannot be found");
                            }
                        }
                        else
                        {
                            break;
                        }
                    }
                    else if(mode7 == 2)
                    {
                        System.out.println("Search for books by: \n" + "1. title \n" + "2. author\n" + "Enter other numbers to exit");
                        int mode2 = sc.nextInt();
                        if(mode2 == 1)
                        {
                            System.out.print("Please enter the name of the book you want to search: ");
                            BookName = sc.next();
                            countBook = 0;
                            for(int i = 0; i < countBookSocial; i++)
                            {
                                if(listBookSocial[i].getNameBook().equals(BookName))
                                {
                                    listBookSocial[i].PrintBook();
                                    countBook ++;
                                }
                            }
                            if(countBook == 0)
                            {
                                System.out.println("The book with the name you entered cannot be found");
                            }
                            
                        }
                        else if(mode2 == 2)
                        {
                            System.out.print("Please enter the author of the book you want to search: ");
                            AuthorName = sc.next();
                            countBook = 0;
                            for(int i = 0; i < countBookSocial; i++)
                            {
                                if(listBookSocial[i].getAuthor().equals(AuthorName))
                                {
                                    listBookSocial[i].PrintBook();
                                    countBook ++;
                                }
                            }
                            if(countBook == 0)
                            {
                                System.out.println("The book with the author you entered cannot be found");
                            }
                        }
                        else
                        {
                            break;
                        }
                    }
                    else
                    {
                        break;
                    }
                    break;
                    
                default:
                    System.out.println(" Thank you for using our app <3 ");
                    System.out.println("_________ Bye!! _________");
                    Condition = false;
                    break;
            }
        } 
    }
}
