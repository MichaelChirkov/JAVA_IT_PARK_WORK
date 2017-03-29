/**
 * Created by Michael on 29.03.2017.
 */
import java.sql.*;
import java.util.Scanner;

public class exampleDB {
    public static void main(String[] args) {
        exampleDB m = new exampleDB();
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        String pname = "";
        String pcity = "";
        int page = 0, pnumber = 0;
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String login = "postgres";
            String password = "qwerty123";
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                while (a != -1) {
                    System.out.println("\nВыберите действие: \n " +
                            "1. Ввести новую запись в таблицу \n" +
                            "2. Показать значение максимального возраста в таблице \n" +
                            "3. Вывести таблицу на экран \n" +
                            "4. Выход из программы \n");
                    a = scanner.nextInt();
                    switch (a){
                        case 1 :
                        System.out.println("Введите имя");
                        pname = scanner.next();
                        System.out.println("Введите город:");
                        pcity = scanner.next();
                        System.out.println("Введите возраст:");
                        page = scanner.nextInt();
                        System.out.println("Введите номер телефона:");
                        pnumber = scanner.nextInt();
                         m.insertNewNote(con, pname, pcity, page, pnumber);
                        break;

                        case 2 : m.maxAge(con);
                        break;
                        case 3 : m.allInfo(con);
                        break;
                        case 4 : a = -1;
                        break;
                    }



                }
            }
            finally{
                        con.close();
                    }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void insertNewNote(Connection con, String name, String city, int age, int number) throws SQLException{
        PreparedStatement stmt = con.prepareStatement("INSERT INTO newTable VALUES (?, ?, ?, ?)");
        stmt.setString(1, name);
        stmt.setString(2, city);
        stmt.setInt(3, age);
        stmt.setInt(4, number);
        stmt.executeUpdate();
        stmt.close();
    }

    private void maxAge (Connection con) throws SQLException{
        Statement stmt = con.createStatement();
        ResultSet rs =  stmt.executeQuery("SELECT max(age) from newTable");
        while (rs.next()) {
            System.out.println("Максимальный возраст = " + rs.getInt(1));
        }
    }

    private void allInfo (Connection con) throws  SQLException {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM newTable");
        while (rs.next()){
            String str = rs.getString(1) +" " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4);
            System.out.println(str);
        }
    }


}
