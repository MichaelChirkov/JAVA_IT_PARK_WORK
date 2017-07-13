import java.util.Arrays;

/**
 * Created by Michael on 13.07.2017.
 */
public class Program {

    public static void main(String[] args) {
        String str = "public class Program {\n" +
                "    public static void main(String[] args) {\n" +
                "       int a = 2017;\n" +
                "       int b = 1;\n" +
                "       int c = a + b;\n" +
                "       System.out.println(c);\n" +
                "    }\n" +
                "}";

    /*    String[] array = str.split(" ");

        for (int i = 0; i < array.length; i ++){
            str2 += array[i];
        } */
        str = str.replace("\n","").replace(" ", "");
        System.out.println(str);

    }
}
