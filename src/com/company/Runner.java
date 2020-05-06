package com.company;

public class Runner {

    private static class inner{

        public static void main(String[] args) {
            //inside another class
            System.out.println("Hello from the other side");

        }
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello World");

    }
}
