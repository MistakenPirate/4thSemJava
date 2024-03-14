package Polymorphism;

class Add_nums
{
    public int add (int a, int b)
    {
        return a + b;
    }
    public int add (int a, int b, int c)
    {
        return a + b + c;
    }
    public double add (double a, double b)
    {
        return a + b;
    }
}

public class MethodOverloading{
    public static void main(String[] args)
    {
        Add_nums ad = new Add_nums();
        System.out.println(ad.add (11, 11));
        System.out.println(ad.add (11, 11,11));
        System.out.println(ad.add (11.5, 11.2));
    }
}

