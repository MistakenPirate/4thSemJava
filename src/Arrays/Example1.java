package Arrays;

public class Example1
{
    public static void main(String[] args)
    {
        int[] a   =   new int[3];// Declaration and instantiation
        a[0]=10;                                       // Initialization
        a[1]=20;
        a[2]=70;

//printing array
        for(int i = 0;  i < a.length;  i++)  // Length is the property of array
            System.out.println(  a[i]   );
    }
}
