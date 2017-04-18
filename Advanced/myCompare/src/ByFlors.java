import java.util.Comparator;

/**
 * Created by Michael on 19.04.2017.
 */
public class ByFlors implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        return o2.getFloors() - o2.getFloors();
    }
}
