/**
 * Created by Student13 on 15.04.2017.
 */
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Square square = new Square("Квадратик");
        Triangle triangle = new Triangle("Эчпочмак");
        Rectangle rectangle = new Rectangle("Прямоуголничек");
        Figures[] figures = { square, triangle, rectangle};

        OutputStream outputStream =
                new FileOutputStream("Z:\\Students\\JAVA_IT_PARK_1\\CHIRKOV\\JAVA_IT_PARK_WORK\\ClassWorks\\Task10\\output.txt");


            for (int i = 0; i < figures.length; i++) {
                byte bytesArray[] = figures[i].getName().getBytes();
                outputStream.write(bytesArray);
                outputStream.write(10);

            }
    }
}
