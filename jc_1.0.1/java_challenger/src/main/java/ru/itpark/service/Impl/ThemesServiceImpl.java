package ru.itpark.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.dao.ThemesDao;
import ru.itpark.model.Theme;
import ru.itpark.service.ThemesService;

import java.util.List;

/**
 * Created by Michael on 05.07.2017.
 */
@Service
public class ThemesServiceImpl implements ThemesService {

    @Autowired
    private ThemesDao themesDao;

    @Override
    public Theme getById(int id) {
        return themesDao.findOne(id);
    }

    @Override
    public Theme addNewTheme(Theme theme) {
        return themesDao.save(theme);
    }

    @Override
    public List<Theme> getAllThemes() {
        return themesDao.findAll();
    }

    @Override
    public int getThemesCount() {
        return themesDao.getThemesCount();
    }
}
