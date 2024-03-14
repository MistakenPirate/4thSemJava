package Arrays;

//Passing Arrays to Method
public class Example3
{
    public void  print_values ( int   b[] )
    {
        for(int  i = 0; i < b.length;  i++)
            System.out.println (  b[i]  )  ;
    }

    public static void main(String args[])
    {
        int a[] = {33,3,4,5};

        Example3   ae2  =    new Example3 ( );
        ae2.print_values ( a );                        //   Passing array to method
    }
}