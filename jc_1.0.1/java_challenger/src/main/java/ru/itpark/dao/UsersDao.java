package ru.itpark.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import ru.itpark.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael on 10.07.2017.
 */
public interface UsersDao extends JpaRepository<User, Integer> {

    User save(User user);

    @Transactional
    @Modifying
    @Query("update User user set user.totalPracticAnswersCount = ?2, user.totalTheoreticAnswersCount = ?3 where user.id =?1")
    void update(int userId, int totalPracticAnswerCount, int totalTheoreticAnswerCount);

    User findByUsername(String username);

    List<User> findAll();

    @Query("select user from User user order by user.totalTheoreticAnswersCount DESC")
    List<User> findUsersByTotalTheoreticTasks();

    @Query("select user from User user order by user.totalPracticAnswersCount DESC")
    List<User> findUsersByTotalPracticTasks();
}
