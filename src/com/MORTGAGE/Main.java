package com.MORTGAGE;

public class Main {

    public static void main(String[] args) {
        // COMPARING OBJECTS :
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);
        System.out.println(point1 == point2); // false
        System.out.println(point1.equals(point2)); // true after overriding
        System.out.println(point1.equals(new TextBox(true, "test")));
        System.out.println(point1.equals(point1));

        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());


        // just for me to practice
        System.out.println(point1.getClass());
        System.out.println(point2.getClass());
        System.out.println(point1 == null);
        System.out.println(point2 == null);

    }
}
