import java.io.IOException;

/**
 * Created by Michael on 14.04.2017.
 */


public class Program {
    public static int charsArrayToInteger(char chars[]){
        String str = new String(chars);
        int result = Integer.valueOf(str);
        return result;
    }

    public static void main(String[] args){
        char[] charsArray = { '3', '2', '1'};
        System.out.println(charsArrayToInteger(charsArray));
    }
}
