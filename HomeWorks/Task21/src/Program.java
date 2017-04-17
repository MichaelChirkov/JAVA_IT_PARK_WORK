import java.io.IOException;

/**
 * Created by Michael on 14.04.2017.
 */
public class Program {

    public static void main(String[] args) throws IOException {
        char[] charsArray = new char[50];
        int[] array = new int[50];
        int i = 0;
        char character;
        do{
            array[i] = System.in.read();
            charsArray[i] = (char)array[i];
            i++;
        } while (charsArray[i-1] != '.'); //пока не 1

        String str = new String(charsArray);
        System.out.println(str);
    }
}
