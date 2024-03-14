package ExceptionHandling;

//Handling single exception
public class Example1
{
    public static void main(String args[])
    {
        int a = 20, b = 0, c;
        try
        {
            c = a / b;
        }
        catch(Exception e)
        {
            System.out.println("Exception :: " + e);
        }
        System.out.println("Rest of the codes of the program..");
    }
}