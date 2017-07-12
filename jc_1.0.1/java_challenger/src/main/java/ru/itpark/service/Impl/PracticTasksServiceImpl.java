package ru.itpark.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.dao.PracticTasksDao;

import ru.itpark.model.PracticTask;
import ru.itpark.model.UserAnswers;
import ru.itpark.service.PracticTasksService;
import ru.itpark.service.UserAnswersService;

/**
 * Created by Michael on 10.07.2017.
 */
@Service
public class PracticTasksServiceImpl implements PracticTasksService {

    @Autowired
    private PracticTasksDao practicTasksDao;

    @Autowired
    private UserAnswersService userAnswersService;


    @Override
    public PracticTask getByIdAndThemeId(int id, int themeId) {
        return practicTasksDao.findByIdAndThemeId(id, themeId);
    }

    @Override
    public PracticTask checkAnswer(String answer, int userId, int themeId, PracticTask currentPracticTask) {
        UserAnswers userAnswers = userAnswersService.getByUserIdAndThemeId(userId, themeId);
        userAnswers.setPracticTaskLast(userAnswers.getPracticTaskLast() + 1);
        if (answer.equals(currentPracticTask.getAnswer())) {
            userAnswers.setPracticAnswerCount(userAnswers.getPracticAnswerCount() + 1);
        }
        userAnswersService.updateInfo(userAnswers);
        PracticTask nextPracticTask = practicTasksDao.findByIdAndThemeId(userAnswers.getPracticTaskLast(), themeId);
        return nextPracticTask;
    }

    @Override
    public int getPracticTaskCountByTheme(int themeId) {
        return practicTasksDao.getPracticTaskCountByTheme(themeId);
    }

    public void dropPrevResults(int userId, int themeId) {
        UserAnswers userAnswers = userAnswersService.getByUserIdAndThemeId(userId, themeId);
        userAnswers.setPracticTaskLast(1);
        userAnswers.setPracticAnswerCount(0);
        userAnswersService.updateInfo(userAnswers);
    }
}
