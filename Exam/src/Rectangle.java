/**
 * Created by Student13 on 08.04.2017.
 */
public class Rectangle extends Figures implements figure {
    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public int getA() {
        return this.a;
    }

    @Override
    public int getB() {
        return this.b;
    }

    @Override
    public double area() {
        return (double)(this.a*this.b) ;
    }

    @Override
    public double perimeter() {
        return this.a*2 + this.b*2;
    }
}
