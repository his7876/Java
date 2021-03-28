package com.company.chapter19;

//19-1 equals 메소드의 정의

import java.util.Objects;
public class Problem1 {

    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(1,2);

        Rectangle r1 = new Rectangle(3,4,5,6);
        Rectangle r2 = new Rectangle(3,4,5,6);

        if(p1.equals(p2)){
            System.out.println("p1 과 p2의 내용이 같다.");
        }
        else{
            System.out.println("p1과 p2의 내용이 다르다.");
        }

        if(r1.equals(r2)){
            System.out.println("r1 과 r2의 내용이 같다.");
        }
        else{
            System.out.println("r1과 r2의 내용이 다르다.");
        }
    }



}

class Point{
    private int xPos;
    private int yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

   public boolean equals(Object obj){
        Point p = (Point) obj;
        if(this.xPos == p.xPos && this.yPos == p.yPos){
            return true;
        }
        else{
            return false;
        }
   }


}
class Rectangle{
    private Point upperLeft;
    private Point lowerLeft;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.upperLeft = new Point(x1,y1);
        this.lowerLeft = new Point(x2,y2);
    }

    public boolean equals(Object obj){
        Rectangle r = (Rectangle) obj;

        if(this.lowerLeft.equals(r.lowerLeft) && this.upperLeft.equals(r.upperLeft)){
            return true;
        }
        else{
            return false;
        }
    }

}
