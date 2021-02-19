import java.util.Scanner;

public class CreateAccount
{
    private String name, phoneNumber, email, account, password, id;
    public CreateAccount()
    {
        this.name = "!!!";
        this.phoneNumber = "!!!";
        this.email = "!!!";
        this.id = "!!!";
    }
    
    public CreateAccount(String name, String phoneNumber, String email, String id)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.id = id;
    }
    
    public void setName(String name)                    {this.name = name;}
    public void setPhoneNumber(String phoneNumber)      {this.phoneNumber = phoneNumber;}
    public void setEmail(String email)                  {this.email = email;}
    public void setId(String id)                        {this.id = id;}
    public String getName()             {return name;}
    public String getPhoneNumber()      {return phoneNumber;}
    public String getEmail()            {return email;}
    public String getId()               {return id;}
    
    public Scanner sc = new Scanner(System.in);
    public void Information() 
    {
        System.out.println("Welcome to the library !!");
        System.out.println("_____________________________");
        System.out.print("Please enter the name of the customer: ");
        name = sc.nextLine();
        System.out.print("Please enter the phone number of the customer: ");
        phoneNumber = sc.nextLine();
        System.out.print("Please enter the email of the customer: ");
        email = sc.nextLine();
        System.out.print("Please enter the id of the customer: ");
        id = sc.nextLine();
        System.out.println("_______________________________________________________");
        System.out.println("Account registration is successful");
    }
    public void PrintInformation()
    {
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("ID: " + id);
        System.out.println("________________________________");
    } 
}
