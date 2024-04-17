package org.example;
public class JEP456 {
    public static void main(String[] args) {
        try{
            int number=Integer.parseInt("not a number");
        } catch (Exception ) {
            System.out.println("Exception caught");
        }
    }
}