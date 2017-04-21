/**
 * Created by Michael on 14.04.2017.
 */


public class Program {
    public static int charsArrayToInteger(char chars[]){
        int temp = 0, base = 10, power;
        for (int i = 0; i < chars.length; i++){
            power = 1;
            for (int j=0; j < chars.length - i -1; j++){
                power *= base;
            }
            temp = temp + ((int)chars[i] - 48)*power;
       }
        return temp;
    }

    public static void main(String[] args){
        char[] charsArray = { '3', '2', '1'};
        System.out.println(charsArrayToInteger(charsArray));

    }
}
