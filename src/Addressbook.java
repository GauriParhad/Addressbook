public class Addressbook {
    import java.util.Scanner;
    import java.io.Console;

    public static void main(String[] args) {
        System.out.println("Welcome to Address book");
        persondetails();
    }
    public static void persondetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the person:");
        System.out.println("Enter the name of the Address:");
        System.out.println("Enter the name of the State:");
        System.out.println("Enter the name of the City:");
        System.out.println("Enter the name of the Contact number:");
        System.out.println("Enter the name of the Email Id:");
        String name = sc.nextline();
        System.out.println("Name of the person:"+name);
        String Address = sc.nextline();
        System.out.println("Address of the person:"+Address);
        String State = sc.nextline();
        System.out.println("Name of the person:"+State);
        String City = sc.nextline();
        System.out.println("Name of the person:"+City);
        String ph_no = sc.nextline();
        System.out.println("Name of the person:"+ph_no);
        String Email_Id = sc.nextline();
        System.out.println("Name of the person:"+Email_Id);


    }
}

