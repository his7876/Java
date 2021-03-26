package com.company.chapter15;

//15-1 메소드 오버라이딩
public class Box {
    public void wrap(){
        System.out.println("Simple Wrapping");
    }
}
class PaperBox extends Box{
    public void wrap(){
        System.out.println("Paper Wrapping");
    }

}
class GoldPaperBox extends PaperBox{
    public void wrap(){
        System.out.println("Gold Wrapping");
    }

}

class Wrapping{

    public static void main(String[] args) {
        Box box1 = new Box();
        PaperBox box2 = new PaperBox();
        GoldPaperBox box3 = new GoldPaperBox();

        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);

    }

    private static void wrapBox(Box box) {
        box.wrap();

    }
}