/**
 * Created by Student13 on 08.04.2017.
 */
public abstract class Figures implements figure {
    protected int a,b,c;

    public Figures(int a) {
        this.a = a;
    }

    public Figures(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Figures(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public boolean equals(Object obj) {

        if (obj instanceof Figures) {

            Figures clone = (Figures) obj;

            return (this.area() == clone.area() && this.perimeter() == clone.perimeter());
        }
        else return false;
    }


}
