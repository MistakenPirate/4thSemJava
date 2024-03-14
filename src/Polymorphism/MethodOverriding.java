package Polymorphism;

class Parent  {
    // private methods are not overridden
    private void m1()
    {
        System.out.println("Parent m1( )");
    }
    protected void m2()
    {
        System.out.println("Parent m2( )");
    }
}

class Child extends Parent  {
    // The new m1() method unique to Child class
    private void m1()
    {
        System.out.println("Child m1( )");
    }
    // overriding method  with more accessibility
    @Override
    public void m2()
    {
        System.out.println("Child m2( )");
    }
}


public class MethodOverriding {
    public static void main(String[] args)
    {
        Parent obj1 = new Parent();
        obj1.m2();
        Parent obj2 = new Child();
        obj2.m2();
    }
}