package Polymorphism;

abstract class Shape
{
    abstract void draw( );
}

class Rectangle extends Shape
{
    void draw ( )
    {
        System.out.println ("Rectangle");
    }
}

class Circle extends Shape
{
    void draw ( )
    {
        System.out.println ("Circle");
    }
}

class AbstractClass{
    public static void main ( String[] args)
    {
        Shape s;
        s = new Circle ( );
        s.draw ( );
        s = new Rectangle();
        s.draw();
    }
}
