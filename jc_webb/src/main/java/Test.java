/**
 * Created by Michael on 05.07.2017.
 */
public class ла сTest {

    //-----Services---------------------
    PracticTask getPracticTask(User_id, theme_id){
        LastTask lastTask = lastTaskDao.findByUserIdAndThemeId;
        PracticTask practicTask = practicTaskDao.findById( lastTask.getPracticId);
        return practicTask;
    }
        boolean checkAnswer(userId, ThemeId, answer1, answer2){
        if (answer1.equals(answer2)){
            UserAnswers userAnswers = UserAnswersDao.findOne(userId, ThemeId);
            userAnswers.setPracticAnswerCount + 1;
            return true;
        }
        return false;
        }


    //-------Dao-----------------------

}
при
/* Список действий:
1. Залогинился( есть user), выбрал тему (получил theme_id).
2. Подгружаю Practic/Theoretic Task используя theme_id и user_id, кладу в View, кладу Task в HttpSession
3. Получаю answerFromPage, беру Task из сессии, вызываю userService.checkAnswer






*/