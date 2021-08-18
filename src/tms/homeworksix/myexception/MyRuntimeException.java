package tms.homeworksix.myexception;

public class MyRuntimeException extends RuntimeException{

    public MyRuntimeException(String message){
        super(message);
    }

    public static void generateCustomExceptionFromJDKException()throws MyRuntimeException{
        try {
            int test = 1/0;
        }catch (ArithmeticException exception){
            throw new MyRuntimeException(exception.getLocalizedMessage());
        }
    }
}

