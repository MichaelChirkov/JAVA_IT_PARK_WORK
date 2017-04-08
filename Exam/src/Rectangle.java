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
    public boolean equals(Object obj) {

        if (obj instanceof Rectangle) {

            Rectangle clone = (Rectangle) obj;

            return (this.area() == clone.area() && this.perimeter() == clone.perimeter());
        }
        else return false;
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
