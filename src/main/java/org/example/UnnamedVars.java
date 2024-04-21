package org.example;

public class UnnamedVars {
    public static void main(String[] args) {
        int[] orderIDs = {34, 45, 23, 27, 15};
        int total = 0;
        for (int _ : orderIDs) {
            total++;
        }
        System.out.println("Total: " + total);

    }
}
