package com.MORTGAGE;

public class Main {

    public static void main(String[] args) {
        // COMPARING OBJECTS :
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);
        System.out.println(point1 == point2); // false
        System.out.println(point1.equals(point2)); // true after overriding
        System.out.println(point1.equals(new TextBox(true, "test")));

        // what if we pass point1
        System.out.println(point1.equals(point1));
        // answer: true but still we can refine override CODE: by adding if ( this = obj ) return true;
    }
}
