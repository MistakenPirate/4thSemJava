package ExceptionHandling;


//Handling Multiple Exceptions
public class Example2
{
    public static void main(String[] args)
    {
        int a[] = new int[5], b = 0, c;
        try
        {
            System.out.println("a[10] " + a[10]);
            c = a[2] / b;
        }

        catch(ArithmeticException e)
        {
            System.out.println("Exception :: " + e);
        }


        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception :: " + e);
        }


//        catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("Exception :: " + e);
//        }
    }
}
//