package tms.homeworksix;

import tms.homeworksix.myexception.MyException;
import tms.homeworksix.myexception.MyRuntimeException;

import java.io.IOException;

public class MainSix {

    public static void main(String[] args) {

        Integer value = null;
        int[] array = {1,2,3};
        try {
            value.intValue();
        }catch (NullPointerException exception){
            exception.printStackTrace();
        }

        try {
            array[4]=5;
        }catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }


        try {
            MyException test = new MyException();
            throw test;
        } catch (MyException exception) {
            exception.printStackTrace();
        }

        try {
            throw new MyRuntimeException("HREN KAKAYA TO");
        } catch (MyRuntimeException exception) {
            exception.printStackTrace();
        }

        try {
            MyRuntimeException.generateCustomExceptionFromJDKException();
        } catch (MyRuntimeException exception) {
            exception.printStackTrace();
        }

        try {
            MainSix.throwRandomException();
        } catch (IOException | MyException | ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }

        try {
            throwRandomException();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException exception) {
            exception.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }

        try {
            halfSuccess();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("this all");
        }
    }

    public static void throwRandomException() throws IOException, ArrayIndexOutOfBoundsException, MyException {
        long result = Math.round(Math.random() * 2);

//        if(result == 0) {
//            throw new IOException("Pseudo IO error");
//        } else if(result == 1) {
//            throw new ArrayIndexOutOfBoundsException("Pseudo Array error");
//        } else {
//            throw new MyException();
        switch ((int) result) {
            case 0:
                throw new IOException("Pseudo IO error");
            case 1:
                throw new ArrayIndexOutOfBoundsException("Pseudo Array error");
            case 2:
                throw new MyException();
        }

    }

    public static void halfSuccess() throws Exception {
        long result = Math.round(Math.random());
        if (result == 1) {
            throw new MyException();
        }
    }

}

