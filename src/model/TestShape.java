package model;
class Shape{
    public void draw(){
        System.out.println("Draw a shape!");
    }
}
class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Draw a circle!");
    }
}
public class TestShape {
    public static void main(String[] args){
        Shape circle = new Circle();
        circle.draw();
    }
}
