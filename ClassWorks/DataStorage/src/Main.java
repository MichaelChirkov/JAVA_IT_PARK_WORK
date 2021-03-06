/**
 * Created by Michael on 26.04.2017.
 */
import dao.HumansDao;
import dao.HumansDaoIoImpl;
import generator.IdGenerator;
import generator.IdGeneratorInFileImpl;
import generator.IdGeneratorInMemoryImpl;
import models.Human;

public class Main {

    public static void main(String[] args) {
        IdGenerator idGenerator = IdGeneratorInFileImpl.getGenerator();

        HumansDao humansDao =
                new HumansDaoIoImpl("humans.txt", idGenerator);

        Human human = humansDao.find(10);

        Human ilmir = new Human("Ilmir", 27);
        Human rustam = new Human("Rustam", 33);
        Human andrey = new Human("Andrey", 24);

        System.out.println(humansDao.save(ilmir));
        System.out.println(humansDao.save(rustam));
        System.out.println(humansDao.save(andrey));



    }
}