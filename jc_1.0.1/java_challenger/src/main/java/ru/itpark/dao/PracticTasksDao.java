package ru.itpark.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.itpark.model.PracticTask;

/**
 * Created by Michael on 10.07.2017.
 */
public interface PracticTasksDao extends JpaRepository<PracticTask, Integer> {

    @Query("select practicTask from PracticTask practicTask where practicTask.id = ?1 and practicTask.themeId = ?2")
    PracticTask findByIdAndThemeId(int id, int themeId);

    @Query("select max(id) from PracticTask practicTask where practicTask.themeId = ?1")
    int getPracticTaskCountByTheme(int themeId);
}
