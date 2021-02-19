package com.MORTGAGE;

public class Main {

    public static void main(String[] args) {
        // COMPARING OBJECTS :
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);
        System.out.println(point1 == point2);
        System.out.println(point1.equals(point2));
        /*
        * result: false - why? the have the same x & y. because, these are reference TYPES. so the values that
        * are stored in these variables are the addresses of POINT OBJECTS in MEMORY. here we are dealing
        * with 2 different POINT OBJECTS.
        * what if we use .equals() method to compare the two objects?
        * result: false again. because the default implementation of this method in the object class
        * compares 2 objects based on their references.
        * SOLUTION: we can OVERRIDE this method to change the implementation of this method so that
        * it compares 2 objects based on their coordinates x & y.
        * so we override equals() method in Point class
         */
    }
}
