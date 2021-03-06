package edu.gonzaga;

/*
Ariana Jansma
Created my own branch, ajansma
About to merge back to asc/appFeature
 */


class Adder {
    int val1;
    int val2;

    public Adder(int new_val1, int new_val2) {
        val1 = new_val1;
        val2 = new_val2;
    }

    public int sumVals(){
        return val1 + val2;
    }

    public int multVals(){
        return val1 * val2;
    }


}

public class Main {
    public static void main(String args[]) {
        System.out.println("Starting app");
        Adder adder = new Adder(10, 20);
        int sum = adder.sumVals();
        int mult = multVals();
        System.out.println("App finished.");
    }
}