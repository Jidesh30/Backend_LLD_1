package org.example.exception;

public class Client {
    public static void main(String[] args) throws Exception {
//        int n =0;
//
//        try {
//            int result = 10/0;
//        } catch (ArithmeticException e){
//            System.out.println("Error: While dividing by zero");
//            throw new  Exception(e);
//        } catch (NullPointerException e) {
//            System.out.println("Error: Null pointer exception");
//            throw new Exception(e);
//        } catch (Exception e) {
//            System.out.println("Error: General exception");
//            throw new Exception(e);
//        } finally {
//            System.out.println("Execution completed");
//        }
        String s = "Scaler";
        try {
            int len = getLength(s);
            System.out.println("Length of the string: " + len);
        } catch (Exception e){
            System.out.println("Exception caught:" + e.getMessage());
        } finally {
            System.out.println("Execution completed");
        }
    }
    public static int getLength(String s) {
        return s.length();
    }
}
