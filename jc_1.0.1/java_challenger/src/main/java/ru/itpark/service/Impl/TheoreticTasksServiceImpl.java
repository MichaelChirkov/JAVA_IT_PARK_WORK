package ru.itpark.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.dao.TheoreticTasksDao;
import ru.itpark.model.PracticTask;
import ru.itpark.model.TheoreticTask;
import ru.itpark.model.UserAnswers;
import ru.itpark.service.TheoreticTasksService;
import ru.itpark.service.UserAnswersService;

/**
 * Created by Michael on 10.07.2017.
 */
@Service
public class TheoreticTasksServiceImpl implements TheoreticTasksService {

    @Autowired
    private TheoreticTasksDao theoreticTasksDao;

    @Autowired
    UserAnswersService userAnswersService;

    @Override
    public TheoreticTask getByIdAndThemeId(int id, int themeId) {
        return theoreticTasksDao.findByIdAndThemeId(id, themeId);
    }

    public void dropPrevResults(int userId, int themeId) {
        UserAnswers userAnswers = userAnswersService.getByUserIdAndThemeId(userId, themeId);
        userAnswers.setTheoreticTaskLast(1);
        userAnswers.setTheoreticAnswerCount(0);
        userAnswersService.updateInfo(userAnswers);
    }

    @Override
    public TheoreticTask checkAnswer(String answer, int userId, int themeId, TheoreticTask currentTheoreticTask) {
        UserAnswers userAnswers = userAnswersService.getByUserIdAndThemeId(userId, themeId);
        userAnswers.setTheoreticTaskLast(userAnswers.getTheoreticTaskLast() + 1);
        if (answer.equals(currentTheoreticTask.getTrueAnswer())) {
            userAnswers.setTheoreticAnswerCount(userAnswers.getTheoreticAnswerCount() + 1);
        }
        userAnswersService.updateInfo(userAnswers);
        TheoreticTask nextTheoreticTask = theoreticTasksDao.findByIdAndThemeId(userAnswers.getTheoreticTaskLast(), themeId);
        return nextTheoreticTask;
    }

    @Override
    public int getTheoreticTaskCountByTheme(int themeId) {
        return theoreticTasksDao.getTheoreticTaskCountByTheme(themeId);
    }
}
