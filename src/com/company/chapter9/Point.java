package com.company.chapter9;

//9-1 다양한 클래스의 정의
public class Point {
    int xPos, yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
    public void showPointInfo(){
        System.out.println("["+xPos+","+yPos+"]");
    }
}

class Circle{
    int rad;
    Point p;
    public Circle(int x, int y, int rad){
        p = new Point(x,y);
        this.rad = rad;
    }

    public void showCircleInfo(){
        System.out.println("rad : "+ rad);
        p.showPointInfo();
    }
}

class Test{
    public static void main(String[] args) {
        Circle circle = new Circle(2, 2, 4);
        circle.showCircleInfo();
    }
}