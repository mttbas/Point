package com.MORTGAGE;

import java.util.Objects;

public class Point {
    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // we comment out the both Override methods which we have created manually and see
    // how we can create them using intellij. code - generate - equals() and hashCode()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//
//        if (!(obj instanceof Point))
//            return false;
//
//        var other = (Point)obj;
//        return other.x == x && other.y == y;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(x,y);
//       // return super.hashCode(); we do not want this. we wanna generate hashcode based on the CONTENT
//        // of these objects. based on the values of x & y. HOW ? easy
//        // we have a class called Objects. (it is defined in java.util) this class has a method
//        // for generating a HASH VALUE. we can give it a bunch of values and it will map
//        // them into HASH VALUES.in THEORY a HASH uniquely identifies objects. it is not 100%
//        // accurate but true in 99% of the time.
//    }
}
