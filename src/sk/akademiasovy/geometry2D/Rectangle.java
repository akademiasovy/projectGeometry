package sk.akademiasovy.geometry2D;

/**
 * Created by host on 11.1.2018.
 */
public class Rectangle implements Operation, Diagonal{
    private double a;
    private double b;

    public Rectangle(double a) {
        this.a = a;
        this.b = a;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle() {
        a=b=0;
    }

    @Override
    public double getArea(){
        return a*b;
    }

    @Override
    public double getPerimeter(){
        return 2*(a+b);
    }

    public double getDiagonal(){
        return Math.sqrt(a*a+b*b);
    }

    public void transpose(){
        double temp;
        temp=a;
        a=b;
        b=temp;
    }
}
