package ru.itpark.service;

import ru.itpark.model.TheoreticTask;

/**
 * Created by Michael on 10.07.2017.
 */
public interface TheoreticTasksService {

    TheoreticTask getByIdAndThemeId(int id, int themeId);

    public void dropPrevResults(int userId, int themeId);

    public int getTheoreticTaskCountByTheme(int themeId);

    public TheoreticTask checkAnswer(String answer, int userId, int themeId, TheoreticTask currentTheoreticTask);

}
