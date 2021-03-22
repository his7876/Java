package com.company.chapter7;

//7-1 생성자를 포함하는 클래스의 정의
public class Triangle {
    double height;
    double bottom;
    double area;

    public Triangle(double height, double bottom) {
        this.height = height;
        this.bottom = bottom;
    }
    public void setHeight(double h){
        height = h;
    }
    public void setBottom(double b){
        bottom = b;
    }
    public double getArea(){
        return area = (height * bottom)/2;
    }

}

class TriangleTestClass{
    public static void main(String[] args) {
        Triangle tri = new Triangle(10,3);
        System.out.println(tri.getArea());

        //-------- 높이, 밑변 변화 ----------//
        tri.setHeight(3);
        tri.setBottom(5);
        System.out.println(tri.getArea());


    }
}
