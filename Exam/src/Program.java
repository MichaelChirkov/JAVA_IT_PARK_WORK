/**
 * Created by Student13 on 08.04.2017.
 */
public class Program {
    public static void main(String[] args){
        Rectangle firstRectangle = new Rectangle(2,5);
        Rectangle secondRectangle = new Rectangle(5,10);
        Square firstSquare = new Square(4);
        Square secondSquare = new Square(4);
        Triangle firstTriangle = new Triangle(3,5,8);
        Triangle secondTriangle = new Triangle(6,3,6);

        Figures[] figures = {firstRectangle,
                                firstSquare,
                                firstTriangle,
                                secondRectangle,
                                secondSquare,
                                secondTriangle};

        for ( int k = 0; k < figures.length; k++){
            System.out.println(figures[k].toString());
        }
        System.out.println("");

            for (int i = 0; i < figures.length; i++) {
                    if (figures[i] != null) {
                        for (int j = i + 1; j < figures.length; j++) {
                            if (figures[j] != null) {

                                if (figures[i].equals(figures[j])) {
                                    figures[j] = null;
                                }
                            }
                        }
                    }
                }

        System.out.println("Hello");


        for ( int k = 0; k < figures.length; k++){
            if (figures[k] != null)
        System.out.println(figures[k].toString());
    }
 }
}

