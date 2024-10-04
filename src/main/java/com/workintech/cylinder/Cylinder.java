package com.workintech.cylinder;

public class Cylinder extends Circle {
    private final double height;

    public Cylinder(double radius, double height) {
        super(radius); // Circle constructor'ını çağırıyoruz
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
