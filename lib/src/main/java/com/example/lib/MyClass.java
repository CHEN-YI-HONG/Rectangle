package com.example.lib;

public class MyClass {
    /*public static void main(String args[]){
        rectangleData rect1 = new rectangleData();
        rectangleData rect2 = new rectangleData(10,15);
        rectangleData rect3 = new rectangleData(rect1);
        rect1.showlongANDweight();
        rect1.showarea();
        rect1.drawRect();
        rect2.showlongANDweight();
        rect2.showarea();
        rect2.drawRect();
        rect3.showlongANDweight();
        rect3.showarea();
        rect3.drawRect();
    }*/
    public static void main(String[] args){
        Rectangle rectObj = new Rectangle(1, 2 ,5 ,5);
        Circle cirObj = new Circle(1, 1, 5);
        Line lineObj = new Line(1, 1, 2, 2);

        rectObj.draw();
        cirObj.draw();
        lineObj.draw();
    }
}
