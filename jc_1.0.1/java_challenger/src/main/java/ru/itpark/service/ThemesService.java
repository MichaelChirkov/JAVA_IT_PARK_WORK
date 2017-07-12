package ru.itpark.service;

import ru.itpark.model.Theme;

import java.util.List;

/**
 * Created by Michael on 05.07.2017.
 */
public interface ThemesService {

    int getThemesCount();

    Theme getById(int id);

    Theme addNewTheme(Theme theme);

    List<Theme> getAllThemes();
}
