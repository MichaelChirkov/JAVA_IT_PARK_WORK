import java.util.Comparator;

/**
 * Created by Michael on 19.04.2017.
 */
public class AnimalsByTypeOfAnimal implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getTypeOfAnimalLenght() - o2.getTypeOfAnimalLenght();
    }
}
