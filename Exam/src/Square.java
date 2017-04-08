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

    public boolean equals(Object obj) {

        if (obj instanceof Square) {

            Square clone = (Square) obj;
            return (this.area() == clone.area() && this.perimeter() == clone.perimeter());
        }
        else return false;
    }


}
