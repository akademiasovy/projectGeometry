package sk.akademiasovy.geometry2D;

/**
 * Created by host on 12.1.2018.
 */
public class Circle implements Operation {
    private double r;

    public Circle(double r) {
        this.r = r;
    }


    @Override
    public double getArea() {
        return Math.PI * r *r;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*r;
    }
}
