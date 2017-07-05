package ru.itpark.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import ru.itpark.models.User;

import java.util.List;

public interface UsersDao extends JpaRepository<User, Integer> {

    //User findById(int id);
    User save(User user);

    @Modifying
    @Query("update User user set user.firstThemeAnswerCount = ?2, user.secondThemeAnswerCount = ?3," +
            "user.thirdThemeAnswerCount = ?4, user.fourThemeAnswerCount = ?5," +
            "user.fiveThemeAnswerCount = ?6, user.complitedTheoreticTasks =?7, user.firstThemePracticAnswerCount = ?8," +
            "user.secondThemePracticAnswerCount = ?9, user.thirdThemePracticAnswerCount = ?10," +
            "user.fourThemePracticAnswerCount = ?11, user.complitedPracticTasks = ?12 where user.id = ?1")
    void update(int id, int firstThemeAnswerCount, int secondThemeAnswerCount,
                int thirdThemeAnswerCount, int fourThemeAnswerCount, int fiveThemeAnswerCount,
                int totalAnswers, int firstThemePracticAnswerCount,int secondThemePracticAnswerCount,
                int thirdThemePracticAnswerCount, int fourThemePracticAnswerCount, int complitedPracticTasks);
    //User update(User user);

    @Modifying
    @Query("select user from User user order by user.complitedTheoreticTasks desc")
    List<User> findUsersByComplitedTheoreticTasks();

    @Modifying
    @Query("select user from User user order by user.complitedPracticTasks desc")
    List<User> findUsersByComplitedPracticTasks();

    List<User> findAll();

    User findByUsername(String Username);
}
