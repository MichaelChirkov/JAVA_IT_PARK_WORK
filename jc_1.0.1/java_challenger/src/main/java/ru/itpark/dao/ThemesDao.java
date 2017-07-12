package ru.itpark.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.itpark.model.Theme;

import java.util.List;

/**
 * Created by Michael on 05.07.2017.
 */
public interface ThemesDao extends JpaRepository<Theme, Integer> {

    Theme findOne(int id);

    Theme save(Theme theme);

    @Query("select max(id) from Theme theme")
    int getThemesCount();

    List<Theme> findAll();

}
