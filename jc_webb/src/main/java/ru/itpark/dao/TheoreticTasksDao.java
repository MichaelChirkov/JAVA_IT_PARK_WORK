package ru.itpark.dao;

import org.springframework.data.repository.CrudRepository;

import ru.itpark.models.TheoreticTask;


public interface TheoreticTasksDao extends CrudRepository<TheoreticTask, Integer> {
    TheoreticTask findById(int id);
}
