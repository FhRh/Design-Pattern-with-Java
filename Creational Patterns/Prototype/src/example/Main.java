package example;

import example.shapes.Circle;
import example.shapes.Rectangle;
import example.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle clonedCircle = (Circle) circle.clone();
        shapes.add(clonedCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for(Shape shape : shapes){
            shapesCopy.add(shape.clone());
        }

        for(int i=0; i<shapes.size() ; i++){
            if(shapes.get(i) != shapesCopy.get(i)){
                System.out.println(i + ": Shapes are different objects");
                if(shapes.get(i).equals(shapesCopy.get(i))){
                    System.out.println(i + ": But they are identical");
                } else{
                    System.out.println(i + ": And they are not identical");
                }
            } else{
                System.out.println(i + ": Shape objects are the same");
            }
        }
    }


}