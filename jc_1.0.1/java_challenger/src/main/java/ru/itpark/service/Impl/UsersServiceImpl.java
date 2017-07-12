package ru.itpark.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.itpark.dao.ThemesDao;
import ru.itpark.dao.UserAnswersDao;
import ru.itpark.dao.UsersDao;
import ru.itpark.model.User;
import ru.itpark.model.UserAnswers;
import ru.itpark.model.UserAnswersPK;
import ru.itpark.service.ThemesService;
import ru.itpark.service.UserAnswersService;
import ru.itpark.service.UsersService;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Michael on 10.07.2017.
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Autowired
    private ThemesService themesService;

    @Autowired
    UserAnswersService userAnswersService;

    private PasswordEncoder encoder = new BCryptPasswordEncoder();


    @Override
    public User register(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        User savedUser = usersDao.save(user);
        int themesCount = themesService.getThemesCount();
        for (int i = 1; i <= themesCount; i++) {
            UserAnswersPK userAnswersPK = new UserAnswersPK(savedUser.getId(), i);
            UserAnswers userAnswers = new UserAnswers(userAnswersPK, 1, 1, 0, 0);
            //userAnswersDao.save(userAnswers);
            userAnswersService.addNewUserAnswers(userAnswers);
        }

        return savedUser;
    }

    @Transactional
    @Override
    public void update(User user) {
        usersDao.update(user.getId(), user.getTotalPracticAnswersCount(), user.getTotalTheoreticAnswersCount());
    }

    @Override
    public User getByUsername(String username) {
        User user = usersDao.findByUsername(username);
        if (user != null) {
            return user;
        } else {
            throw new IllegalStateException("User not found");
        }
    }

    @Override
    public boolean checkUsernameAndName(String username, String name) {
        return true;
    }

    @Override
    public List<User> getUsers() {
        return usersDao.findAll();
    }

    public void getTotalAnswers(){
        List<User> users = usersDao.findAll();
    for (User user : users) {
            user.setTotalPracticAnswersCount(userAnswersService.getAllPracticAnswersByUserId(user.getId()));
            user.setTotalTheoreticAnswersCount(userAnswersService.getAllTheoreticAnswersByUserId(user.getId()));
            usersDao.update(user.getId(), user.getTotalPracticAnswersCount(), user.getTotalTheoreticAnswersCount());
        }
    }

    @Override
    public List<User> getTheoreticalTopList() {
        getTotalAnswers();
        return usersDao.findUsersByTotalTheoreticTasks();
    }

    @Override
    public List<User> getPracticTopList() {
        getTotalAnswers();
        return usersDao.findUsersByTotalPracticTasks();
    }
}
