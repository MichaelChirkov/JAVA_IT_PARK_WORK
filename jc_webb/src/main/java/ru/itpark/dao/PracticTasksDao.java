package ru.itpark.dao;

import org.springframework.data.repository.CrudRepository;
import ru.itpark.models.PracticTask;

/**
 * Created by Michael on 04.07.2017.
 */
public interface PracticTasksDao extends CrudRepository<PracticTask, Integer> {
    PracticTask findById(int id);
}

