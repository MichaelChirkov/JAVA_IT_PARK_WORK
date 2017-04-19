import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Michael on 19.04.2017.
 */
public class Program {
    public static <T> void print(T[] objects){
        System.out.println();
        for ( int p = 0; p < objects.length; p++){
            System.out.println(objects[p].toString());
        }
    }

    public static void makeClassInnstanseFromFile(char[] chars, Human[] humans){
        String strName = "", strAge = "";
        int k = 0;
        for (int i = 0; i < chars.length; i++){
            if (( chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z')){
                strName = strName + chars[i];
            }
            if (chars[i] >= '1' && chars[i] <= '9'){
                strAge = strAge + chars[i];
            }
            if ((int)chars[i] == 13 || (int)chars[i] == 0 ){
                int Age = Integer.parseInt(strAge, 10);
                humans[k] = new Human(strName, Age);
                strAge = "";
                strName = "";
                k++;
            }
        }
    }

    public static void main(String[] args)  {
        char[] chars = new char[36];
        Human[] humans = new Human[4];
        int i = 0, k = 0;
        String strName = "";
        String strAge = "";
        //чтение из файла данных в массив chars
        try (FileReader fileLink2 = new FileReader("humans_input.txt")) {
            int c;
            while ((c = fileLink2.read()) != -1) {
                chars[i] = (char)c;
                i++;
            }
            System.out.println("Чтение из файла с помощью " + fileLink2.getClass().getSimpleName() + " прошло успешно.");
        }
        catch ( IOException e){
            System.out.println("Ошибка при чтении из файла");
            }

        makeClassInnstanseFromFile(chars,humans);
        print(humans); // вывод на экран
        Sort.sort(humans); // сортировка прочитанного массива
        print(humans); // вывод на экран
        //запись отсортированного массива в файл
        try (FileWriter fileLink1 = new FileWriter("humans_output.txt")){
            String str;
            for ( i = 0; i < humans.length; i++ ){
            str = humans[i].getName() + " " + humans[i].getAge() + "\n";
            fileLink1.write(str);
            }
            System.out.println("Запись в файл c помощью " +fileLink1.getClass().getSimpleName() + " прошла успешно.");
        }
        catch (IOException e){
            System.out.println("Ошибка при записи в файл");
        }
    }
}
