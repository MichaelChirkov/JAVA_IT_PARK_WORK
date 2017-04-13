import java.io.File;
import java.io.IOException;

/**
 * Created by Michael on 13.04.2017.
 */
public class FileClassTest {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\Michael\\Desktop\\testFile.txt");
        p("Имя файла " + file1.getName());
        p("Путь к файлу " + file1.getPath());
        p("Директория Файла " + file1.getParent());
        p("Последнее изменение файла " + file1.lastModified());
        if (file1.exists()) {
            System.out.println("Файл существует");
        } else {
            System.out.println("не существует");
        }
        p(file1.isDirectory() ? "Да, это директория" : "Нет, это не директория");
        p(file1.isFile() ? "Да, это файл" : "Нет, это не файл ");
        p("Файл весит " + file1.length() + " байт");

        ////////////////////////////////////////////////////////////////////////////
        System.out.println();

        File file2 = new File("C:\\Users\\Michael\\Desktop\\testFile2");
        if (file2.mkdir()) {
            System.out.println("Директория создана");
        } else {
            System.out.println("Директория не создана");
        }

        File file3 = new File("C:\\Users\\Michael\\Desktop\\testFile2\\newTestfile3.txt");
        try {
            file3.createNewFile();
        } catch (IOException e) {
            System.out.println("Ошибочка какая-то");
        }

        File file6 = new File("C:\\Users\\Michael\\Desktop\\testFile2\\newTestDirectory");

            file6.mkdir();
        if (file2.isDirectory()){
            System.out.println("Директория " + file2.getName() + " состоит из:");
            String[] fileList = file2.list();
            for (String currentString : fileList){
                System.out.println(currentString);
            }
        }
    }
}
