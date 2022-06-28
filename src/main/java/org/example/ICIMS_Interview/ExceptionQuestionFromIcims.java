package org.example.ICIMS_Interview;

public class ExceptionQuestionFromIcims {
   public String ExceptionQuestionFromIcims() {
       try{
           int a=0;
           int b=10;
           System.out.println(b/a);
           System.out.println("try block");
       }
       catch (ArrayIndexOutOfBoundsException e){
           //return "ArrayIndexOutofBound";
           System.out.println(e);
       }
       catch (ArithmeticException e){
          // System.out.println(e+" Arithmetic Exception\n");
           return "e";
       }
       finally {
          // System.out.println("finally");
            return "finally";
       }
   }
}
