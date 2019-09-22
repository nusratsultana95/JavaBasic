package newJava;

public class ExceptionHandaling {
    public static void main(String[] args) {
        String name []={"x","y","z"};

        //try-keyword{--try block starts
        //   body of the try block
        //}--try block ends
        // catch- keyword(Exception name which we are trying to catch e) {println}

        try{
        System.out.println(name[4]);}
        catch (ArrayIndexOutOfBoundsException e){// u have to use "e" or "ex" after ArrayIndexOutOfBoundsException
            System.out.println("exception occurred");
        }

        int num[]={10,20,30};
        try {
            System.out.println(num[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("exception handled");
            ex.printStackTrace();//it helps to understand where the actual problem occurred. It helps to trace the exception.if you use it u need to use ex on the top too.

        }//uses of finally
        finally {// no matter what when u use finally block always get executed.uses>> DB connectivity closing & file reader closing

        }

    }
}
