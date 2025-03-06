package com.workintech.pool;

public class Cuboid extends Rectangle {
    private final double height;

    public Cuboid(double width, double length, double height) {
        super(width, length); // Rectangle constructor'ını çağırıyoruz
        this.height = (height < 0) ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
