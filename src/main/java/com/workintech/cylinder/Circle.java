package com.workintech.cylinder;

public class Circle {
    private double radius;

    // Constructor'da radius'a değer atıyoruz
    public Circle(double radius) {
        setRadius(radius);
    }

    // Yarıçapı güvenli bir şekilde ayarlayan setter metodu
    public void setRadius(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    // Yarıçapı döndüren getter metodu
    public double getRadius() {
        return radius;
    }

    // Alan hesaplama metodu
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
