package ExceptionHandling;

//Finally Block
public class Example3
{
    public static void main(String[] args)
    {
        int  a = 5, b = 0, c;
        try
        {
            c = a / b;
        }
        catch(Exception e)
        {
            System.out.println("Exception :: " + e);
        }
        finally
        {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}
