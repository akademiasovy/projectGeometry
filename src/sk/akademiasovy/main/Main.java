package sk.akademiasovy.main;

import sk.akademiasovy.geometry.Rectangle;
import sk.akademiasovy.geometry.Square;

/**
 * Created by host on 11.1.2018.
 */
public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(7.5);
        Square square2 = new Square();

        System.out.println("Area of square1 is "+ square1.getArea() );
        System.out.println("Perimeter of square1 is "+ square1.getPerimeter() );
        System.out.println("Diagonal's length of square1 is "+ square1.getDiagonal() );

        Rectangle rect1=new Rectangle(18.5, 11.15);

        System.out.println("Area of rect1 is "+ rect1.getArea() );
        System.out.println("Perimeter of rect1 is "+ rect1.getPerimeter() );
        System.out.println("Diagonal's length of rect1 is "+ rect1.getDiagonal() );
    }
}
