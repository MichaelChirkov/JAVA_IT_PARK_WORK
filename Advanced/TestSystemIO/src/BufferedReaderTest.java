import java.io.*;

/**
 * Created by Michael on 13.04.2017.
 */
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        int count = 0;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[50];
        for (int i = 0; i < str.length; i++) {
            str[i] = reader.readLine();
            count++;
                if (str[i].equals("exit")){
                    break;
                }
        }
        PrintWriter printWriter = new PrintWriter(System.out, true);
        for (int i = 0; i < count; i ++ ){
            printWriter.println(str[i]);
        }

        //////////////////////////////////////////////////////////////////////////////////////////

        FileInputStream input;
        input = new FileInputStream("C:\\Users\\Michael\\Desktop\\testFile2\\newTestfile.txt");
        FileOutputStream output = new FileOutputStream("C:\\Users\\Michael\\Desktop\\testFile2\\newTestfile3.txt");
        try {
           int i;
           do {
               i = input.read();
                   if (i != 46){
                      /* if ( i == 32){
                           printWriter.print(" ");
                       } */
                       System.out.print((char)i);
                   }
           } while (i !=46);
            input.close();
        }

        catch (FileNotFoundException e){
            System.out.println("Что то нету таких файлов");
        }
        finally {
            input.close();
        }

        char b[] = {'a', 'b', 'c'};
        try {
            for (int i = 0; i < b.length; i ++){
                output.write(b[i]);
            }
        }
        catch (IOException e){
            System.out.println("что то пошло не так, проверьте код");
        }
        finally {
            output.close();
        }





    }
}
