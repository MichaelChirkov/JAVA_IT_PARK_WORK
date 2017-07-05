package ru.itpark.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.itpark.dao.UsersDao;
import ru.itpark.models.User;
import ru.itpark.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UsersDao usersDao;

    private PasswordEncoder encoder = new BCryptPasswordEncoder();


   @Transactional
    @Override
    public void update(User user) {
       int theoreticAnswers = user.getFirstThemeAnswerCount() + user.getSecondThemeAnswerCount() +
               user.getThirdThemeAnswerCount() + user.getFourThemeAnswerCount() + user.getFiveThemeAnswerCount();
       int practicAnswers = user.getFirstThemePracticAnswerCount() + user.getSecondThemePracticAnswerCount() +
               user.getThirdThemePracticAnswerCount() + user.getFourThemePracticAnswerCount();
        usersDao.update(user.getId(), user.getFirstThemeAnswerCount(), user.getSecondThemeAnswerCount(),
                user.getThirdThemeAnswerCount(), user.getFourThemeAnswerCount(), user.getFiveThemeAnswerCount(),
                theoreticAnswers, user.getFirstThemePracticAnswerCount(), user.getSecondThemePracticAnswerCount(),
                user.getThirdThemePracticAnswerCount(), user.getFourThemePracticAnswerCount(), practicAnswers);
    }

    /*@Transactional
    @Override
    public User update(User user) {
        return usersDao.update(user);
    } */

    @Override
    public User findByLogin(String username) {
        User user = usersDao.findByUsername(username);
        if (user != null) {
            return user;
        } else {
            throw new IllegalStateException("User not found");
        }

    }

    @Override
    public List<User> getTheoreticalTopList() {
        return usersDao.findUsersByComplitedTheoreticTasks();
    }

    @Override
    public List<User> getPracticTopList() {
        return usersDao.findUsersByComplitedPracticTasks();
    }

    @Override
    public User register(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        User savedUser = usersDao.save(user);
        return savedUser;
    }

    //Возвращает false, если юзер уже есть, true - если такого юзера нету
    @Override
    public boolean checkUser(String userName, String name) {

        User user = usersDao.findByUsername(userName);
        if (user == null) {
            return true;
        } else {

            if ((user.getUsername().equals(userName)) || (user.getName().equals(name))) {
                return false;
            } else {
                return true;
            }
        }
    }

    @Override
    public boolean checkUserName(String userName) {
        User user = usersDao.findByUsername(userName);
        if (user == null) {
            return true;
        } else {
            if ((user.getUsername().equals(userName))) {
                return false;
            } else {
                return true;
            }
        }
    }
}
