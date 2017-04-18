/**
 * Created by Michael on 16.04.2017.
 */
import java.util.Scanner;
import java.util.Random;
public class GeometricMethod {
    public static void main(String[] args) {
        int N; // объявляем количество точек
        double y0 = 0, y1= 19.0, x0 = 0, x1= 10.19; //
        int pointsInArea = 0; // счетчик. точки попавшие в площадь нашей фигуры
        double rectangleArea = 19.0*10.19; // площадь прямоугольника в котором находится наша фигура
        double figureArea; // площадь нужной нам фигуры
        //создание объектов клаасов
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Point point = new Point();
        //
        System.out.println("Введите N: ");
        N = scanner.nextInt(); //Ввод N пользователем
        for (int i = 0; i < N; i ++){
            point.setX(x0 + (x1 - x0)*random.nextDouble()); // генерируем случаную координату Х  в диапозоне от 0-10
            point.setY(y0 + (y1 - y0)*random.nextDouble()); // -- // -- Y в диапозоне от 0 до 19
            System.out.println("Точка с координатами  " + point.getX() + " ; " + point.getY()); // вывод  координат получившейся точки на экран
            if ((point.getY() > point.getX()) && (point.getY() < (-0.5*point.getX()*point.getX() + 6*point.getX() +1))){
                pointsInArea++;
            }
        }
        System.out.println("Количество точек попавших в области фигуры равно " + pointsInArea);
        figureArea = rectangleArea *((double)pointsInArea/(double)N); //вычисление закращенной площади фигуры по методичке форумула (8)
        System.out.println("Площадь фигуры равна " + figureArea);
    }
}
