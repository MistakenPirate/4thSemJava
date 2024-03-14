package Arrays;

public class Example2
{
    public static void main(String args[])
    {
        int arr[][] =  { {1, 2}, {3, 4}  };      //  Declaring and initializing 2D array

//  Printing 2D array

        for(int   i = 0;  i < 2;  i++)
        {
            for(int   j = 0;  j < 2;  j++)
            {
                System.out.print(  arr[i][j]  +  " ");
            }
            System.out.println();
        }
    }
}