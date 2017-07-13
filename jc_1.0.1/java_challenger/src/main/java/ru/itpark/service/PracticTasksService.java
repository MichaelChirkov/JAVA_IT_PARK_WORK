package ru.itpark.service;

import ru.itpark.model.PracticTask;

/**
 * Created by Michael on 10.07.2017.
 */
public interface PracticTasksService {

    PracticTask getByIdAndThemeId( int id, int themeId);

    PracticTask checkAnswer( String answer, int userId, int themeId, PracticTask currentPracticTask);

    int getPracticTaskCountByTheme(int themeId);

    public void dropPrevResults(int userId, int themeId);
    String convertAnswer (String answer);
    int getComplitedPracticTasksCountForProgressBar(int userId, int themeId);
}
