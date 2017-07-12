package ru.itpark.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.itpark.dao.UserAnswersDao;
import ru.itpark.model.UserAnswers;
import ru.itpark.service.UserAnswersService;

/**
 * Created by Michael on 10.07.2017.
 */
@Service
public class UserAnswersServiceImpl implements UserAnswersService {

    @Autowired
    private UserAnswersDao userAnswersDao;

    @Override
    public UserAnswers addNewUserAnswers(UserAnswers userAnswers) {
        return userAnswersDao.save(userAnswers);
    }

    @Override
    public UserAnswers getByUserIdAndThemeId(int userId, int themeId) {
        return userAnswersDao.findById_User_idAndId_Theme_id(userId, themeId);
        //userAnswersDao.findByUserIdAndThemeId( userId, themeId );
    }

    @Transactional
    @Override
    public void updateInfo(UserAnswers userAnswers) {

        userAnswersDao.update(userAnswers.getId().getUser_id(), userAnswers.getId().getTheme_id(),
                userAnswers.getPracticAnswerCount(), userAnswers.getPracticTaskLast(),
                userAnswers.getTheoreticAnswerCount(), userAnswers.getTheoreticTaskLast());
    }

    @Override
    public int getLastPracticTask(int userId, int themeId) {
        return userAnswersDao.findPracticLastTaskByUserIdAndThemeId(userId, themeId);
    }

    @Override
    public int getPracticAnswerCount(int userId, int themeId) {
        return userAnswersDao.findPracticAnswerCountByUserIdAndThemeId(userId, themeId);
    }

    @Override
    public int getLastTheoreticTask(int userId, int themeId) {
        return userAnswersDao.findTheoreticLastTaskByUserIdAndThemeId(userId, themeId);
    }

    @Override
    public int getTheoreticAnswerCount(int userId, int themeId) {
        return userAnswersDao.findTheoreticAnswerCountByUserIdAndThemeId(userId, themeId);
    }

    @Override
    public int getAllTheoreticAnswersByUserId(int userId) {
        return userAnswersDao.findAllTheoreticAnswersByUserId(userId);
    }

    @Override
    public int getAllPracticAnswersByUserId(int userId) {
        return userAnswersDao.findAllPracticAnswersByUserId(userId);
    }
}
