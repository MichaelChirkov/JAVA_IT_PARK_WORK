package ru.itpark.service;

import ru.itpark.model.UserAnswers;

/**
 * Created by Michael on 10.07.2017.
 */
public interface UserAnswersService {

    UserAnswers addNewUserAnswers(UserAnswers userAnswers);

    UserAnswers getByUserIdAndThemeId(int userId, int themeId);

    void updateInfo(UserAnswers userAnswers);

    int getLastPracticTask(int userId, int themeId);

    int getPracticAnswerCount(int userId, int themeId);

    int getLastTheoreticTask(int userId, int themeId);

    int getTheoreticAnswerCount(int userId, int themeId);

    int getAllTheoreticAnswersByUserId(int userId);

    int getAllPracticAnswersByUserId(int userId);
}
