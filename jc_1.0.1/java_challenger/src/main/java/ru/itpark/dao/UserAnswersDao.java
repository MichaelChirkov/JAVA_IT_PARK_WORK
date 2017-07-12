package ru.itpark.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import ru.itpark.model.UserAnswers;

/**
 * Created by Michael on 10.07.2017.
 */
public interface UserAnswersDao extends JpaRepository<UserAnswers, Integer> {

    UserAnswers save( UserAnswers userAnswers);

    @Modifying
    @Query("update UserAnswers userAnswers set userAnswers.practicAnswerCount = ?3, userAnswers.practicTaskLast = ?4," +
            "userAnswers.theoreticAnswerCount = ?5, userAnswers.theoreticTaskLast = ?6 where userAnswers.id.user_id = ?1 and " +
            "userAnswers.id.theme_id = ?2")
    void update(int userId, int themeId, int practicAnswerCount, int practicLastTask, int theoreticAnswerCount,
                int theoreticLastTask);

    @Query("select userAnswers from UserAnswers userAnswers where userAnswers.id.user_id = ?1 and userAnswers.id.theme_id = ?2")
    UserAnswers findById_User_idAndId_Theme_id(int userId, int themeId);

    @Query("select userAnswers.practicTaskLast from UserAnswers userAnswers where userAnswers.id.user_id = ?1 and userAnswers.id.theme_id = ?2")
    int findPracticLastTaskByUserIdAndThemeId(int userId, int themeId);

    @Query("select userAnswers.practicAnswerCount from UserAnswers userAnswers where userAnswers.id.user_id = ?1 and userAnswers.id.theme_id = ?2")
    int findPracticAnswerCountByUserIdAndThemeId(int userId, int themeId);

    @Query("select userAnswers.theoreticTaskLast from UserAnswers userAnswers where userAnswers.id.user_id = ?1 and userAnswers.id.theme_id = ?2")
    int findTheoreticLastTaskByUserIdAndThemeId(int userId, int themeId);

    @Query("select userAnswers.theoreticAnswerCount from UserAnswers userAnswers where userAnswers.id.user_id = ?1 and userAnswers.id.theme_id = ?2")
    int findTheoreticAnswerCountByUserIdAndThemeId(int userId, int themeId);

    @Query("select sum(userAnswers.practicAnswerCount) from UserAnswers  userAnswers where userAnswers.id.user_id = ?1")
    int findAllPracticAnswersByUserId(int user_id);

    @Query("select sum(userAnswers.theoreticAnswerCount) from UserAnswers  userAnswers where userAnswers.id.user_id = ?1")
    int findAllTheoreticAnswersByUserId(int user_id);
}
