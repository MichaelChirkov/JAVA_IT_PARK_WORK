/**
 * Created by Student13 on 08.04.2017.
 */
public class Verificator {

    public void verify(String password){
        if (password.length() < 6){
            throw new PasswordException();
        }
    }
}
