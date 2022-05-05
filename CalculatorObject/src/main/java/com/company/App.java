package com.company;

public class App {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
//1 + 1
        System.out.println("1 + 1 = " + calculation.add(1,1));
//23 - 52
        System.out.println("23 - 52= " + calculation.subtract(23,52));
//34 * 2
        System.out.println("34 * 2 = " + calculation.multiply(34,2));
//12/3
        System.out.println("12 / 3 = " + calculation.divide(12,3));
//12/7
        System.out.println("12 / 7 = " + calculation.divide(12,7));
//3.4 + 2.3
        System.out.println("3.4 + 2.3 = " + calculation.add(3.4f, 2.3f));
//6.7 * 4.4
        System.out.println("6.7 * 4.4 = " + calculation.multiply(6.7f, 4.4f));
//5.5 - 0.5
        System.out.println("5.5 - 0.5 = " + calculation.subtract(5.5f,0.5f));
//10.8/2.2
        System.out.println("10.8 / 2.2 = " + calculation.divide(10.8f, 2.2f));
    }
}
