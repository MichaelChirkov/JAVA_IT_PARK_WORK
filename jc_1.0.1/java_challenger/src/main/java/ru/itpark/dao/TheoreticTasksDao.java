package ru.itpark.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.itpark.model.TheoreticTask;

/**
 * Created by Michael on 10.07.2017.
 */
public interface TheoreticTasksDao extends JpaRepository<TheoreticTask, Integer> {

    TheoreticTask findByIdAndThemeId(int id, int themeId);

    @Query("select max(id) from TheoreticTask theoreticTask where theoreticTask.themeId = ?1")
    int getTheoreticTaskCountByTheme(int themeId);
}
