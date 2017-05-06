package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Student13 on 06.05.2017.
 */
public class UsersDaoJdbcImpl implements UsersDao {
    @Override
    private Connection connection;
    public UsersDaoJdbcImpl(){
        connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/CHIRKOV_BD",
                        "postgres",
                        "Zaq12wsx");
    }
    public int save(Object model) {
        return 0;
    }

    @Override
    public Object find(int id) {
        return null;
    }

    @Override
    public void update(Object model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public LinkedList findAll() {
        return null;
    }
}
