package com.MORTGAGE;

public class Main {

    public static void main(String[] args) {
        // COMPARING OBJECTS :
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);
        System.out.println(point1 == point2); // false
        System.out.println(point1.equals(point2)); // true after overriding
        System.out.println(point1.equals(new TextBox(true, "test")));
        // super and sub class constructors are executed respectively ...
        // boolean result of line 11 :
        // first EXCEPTION
        // then false after making changes to .equals() method and overriding it better!!!

        /*
        * run:
        * false --- for ==
        * true ---- after overriding .equals()
        *
        * however it has still problem: because .equals() below is of the TYPE Object
        * @Override
          public boolean equals(Object obj) {
             var other = (Point)obj;
             return other.x == x && other.y == y;
          }
        * so we can pass any object in it. see line 11. we pass new TextBox() object and we get EXCEPTION.
        * SOLUTION: before casting we need to make sure that the obj is an InSTANCE OF Point class
        * so we add:
        * if (!(obj instanceof Point))
        * return false;
        * other wise cast the object down to point. and change the implementation of .equals()
        *
        *
         */
    }
}
