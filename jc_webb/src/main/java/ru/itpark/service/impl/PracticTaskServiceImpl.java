package ru.itpark.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.dao.PracticTasksDao;
import ru.itpark.models.PracticTask;
import ru.itpark.service.PracticTaskService;

/**
 * Created by Michael on 04.07.2017.
 */
@Service
public class PracticTaskServiceImpl implements PracticTaskService {
    @Autowired
    private PracticTasksDao practicTasksDao;

    @Override
    public PracticTask getById(int id) {
        return practicTasksDao.findById(id);
    }
}
