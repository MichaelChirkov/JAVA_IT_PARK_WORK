/**
 * Created by Student13 on 08.04.2017.
 */
public class Square extends Figures implements figure {
    public Square(int a) {
        super(a);
    }


    public int getA() {
        return this.a;
    }


    public double area() {
        return this.a*this.a;
    }


    public double perimeter() {
        return 4*this.a;
    }


}
