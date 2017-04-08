/**
 * Created by Student13 on 08.04.2017.
 */
public class Square extends Figures implements figure {
    public Square(int a) {
        super(a);
    }

    @Override
    public int getA() {
        return this.a;
    }

    @Override
    public double area() {
        return this.a*this.a;
    }

    @Override
    public double perimeter() {
        return 4*this.a;
    }


}
