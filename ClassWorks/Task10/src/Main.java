/**
 * Created by Student13 on 15.04.2017.
 */
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Square square = new Square("Square");
        Triangle triangle = new Triangle("Triangle");
        Rectangle rectangle = new Rectangle("Rectangle");
        Figures[] figures = { square, triangle, rectangle};

        OutputStream outputStream =
                new FileOutputStream("Z:\\Students\\JAVA_IT_PARK_1\\CHIRKOV\\JAVA_IT_PARK_WORK\\ClassWorks\\Task10\\output.txt");
        InputStream input =
                new FileInputStream("output.txt");
//запис в файл
            for (int i = 0; i < figures.length; i++) {
                byte bytesArray[] = figures[i].getName().getBytes();
                outputStream.write(bytesArray);
                outputStream.write(10);

            }



// чтение из файла
        byte bytesFromFile[] = new byte[100];
        input.read(bytesFromFile);

        for (int i = 0; i < bytesFromFile.length; i++) {
            System.out.print((char)bytesFromFile[i]);
        }
    }
}
