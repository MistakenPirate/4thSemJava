package ExceptionHandling;

//User Defined Exceptions
class InvalidAgeException extends Exception {
    InvalidAgeException()  {
        System.out.println("Not eligible to vote");
    }
}

class Example5  {
    static void validate(int age) throws InvalidAgeException {
        if(age < 18)
            throw new InvalidAgeException();
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]) {
        try
        {
            validate(12);
        }
        catch(Exception m) {
            System.out.println("Exception occured: "+m);
        }
        System.out.println("rest of the code...");
    }
}