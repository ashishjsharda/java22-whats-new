package org.example;

import java.math.BigInteger;

public class StatementBeforeSuper extends BigInteger {

    public StatementBeforeSuper(long val) {
        if ((val<=0)){
            throw new IllegalArgumentException("Value must be positive");
        }
        super(Long.toString(val));
    }
    public static void main(String[] args) {

        try{
            StatementBeforeSuper statementBeforeSuper = new StatementBeforeSuper(100);
            System.out.println("Value is: "+statementBeforeSuper);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
