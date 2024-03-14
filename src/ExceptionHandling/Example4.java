package ExceptionHandling;


//Throws Keyword
public class Example4 {
        public  void validate(int age)
        {
            if(age<18)
                throw new ArithmeticException("not valid");
            else
                System.out.println("welcome to vote");
        }

        public int division() throws ArithmeticException
        {
            int a = 20, b = 0, c;
            return (a / b);
        }

        public static void main(String[] args)
        {
//            Example4 eht = new Example4();
//            example.validate(13);
//            System.out.println("Rest of the code...");

            Example4 ehts  =new Example4();
            try
            {
                System.out.println("Result = " + ehts.division());
            }
            catch(Exception e)
            {
                System.out.println("Exception :: " + e);
            }
            finally
            {
                System.out.println("Rest of the codes of the program");
            }
        }


    }
