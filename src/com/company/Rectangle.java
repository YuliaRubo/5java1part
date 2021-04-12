package com.company;

public class Rectangle {
    private static int createdRectangles=0;
    protected double x;
    protected double y;
    private static final String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private static final String ENGLISH_CLASS_NAME = "Rectangle";


    public Rectangle(double x, double y) {
        createdRectangles++;
        this.x = x;
        this.y = y;
    }

    public Rectangle(double x) {
        createdRectangles++;
        this.x = x;
        this.y = x;
    }

    public double calculateArea() {
        return this.x*this.y;
    }

    public void printArea() {
        System.out.println("Площадь " + setRectangleKind() + " " + calculateArea());
    }

    public void printRectangleKind() {
        if (this.x == this.y) {
            System.out.println("Это квадрат");
        } else {
            System.out.println("Это прямоугольник");
        }
    }

    public String setRectangleKind() {
        if (this.x == this.y) {
            return "квадратa";
        } else {
            return "прямоугольникa";
        }
    }

    public boolean isTheSameRectangle(Rectangle R2) {
        if (R2.x==this.x & R2.y==this.y ) {
            return true;
        } else {
            return false;
        }
    }

    static void printRectanglesCount(){
        System.out.println("Всего было созданно "+ createdRectangles + " прямоугольников");
    }

    public static void   printClassName(boolean printInRussian) {
        if (printInRussian) {
            System.out.println(RUSSIAN_CLASS_NAME);
        } else {
            System.out.println(ENGLISH_CLASS_NAME);
        }
    }

}
