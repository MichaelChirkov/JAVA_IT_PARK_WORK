/**
 * Created by Student13 on 08.04.2017.
 */

public class Triangle extends Figures implements figure  {
    public Triangle(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public double area() {
        double p = (double)((this.a + this.b + this.c)/2);
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }

    @Override
    public double perimeter() {
        return this.a + this.b +this.c;
    }


}
