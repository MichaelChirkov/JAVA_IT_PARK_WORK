package ru.itpark.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.dao.TheoreticTasksDao;

import ru.itpark.models.TheoreticTask;
import ru.itpark.service.TheoreticTaskService;

@Service
public class TheoreticTaskServiceImpl implements TheoreticTaskService {
    @Autowired
    private TheoreticTasksDao theoreticTasksDao;

    @Override
    public TheoreticTask getByID(int id) {
        return theoreticTasksDao.findById(id);
    }
}
