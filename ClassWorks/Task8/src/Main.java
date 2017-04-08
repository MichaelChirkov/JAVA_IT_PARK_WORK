/**
 * Created by Student13 on 08.04.2017.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password = "";
        Scanner scanner = new Scanner(System.in);
        Verificator verificator = new Verificator();
        System.out.println("Введите пороль:");
        try {
            password = scanner.nextLine();
            verificator.verify(password);
        } catch (PasswordException e) {
            System.out.println("Ошибка поймана");
        }
    }
}
