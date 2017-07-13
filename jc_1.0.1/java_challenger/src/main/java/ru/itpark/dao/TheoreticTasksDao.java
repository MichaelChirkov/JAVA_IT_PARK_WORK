package ru.itpark.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.itpark.model.TheoreticTask;

/**
 * Created by Michael on 10.07.2017.
 */
public interface TheoreticTasksDao extends JpaRepository<TheoreticTask, Integer> {
    @Query("select theoreticTask from TheoreticTask theoreticTask where theoreticTask.id.id = ?1 and theoreticTask.id.themeId = ?2")
    TheoreticTask findByIdAndThemeId(int id, int themeId);

    @Query("select max(theoreticTask.id.id) from TheoreticTask theoreticTask where theoreticTask.id.themeId = ?1")
    int getTheoreticTaskCountByTheme(int themeId);
}
