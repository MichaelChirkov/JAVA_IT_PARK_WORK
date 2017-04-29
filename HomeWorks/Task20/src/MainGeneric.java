/**
 * Created by Michael on 20.04.2017.
 */
import java.util.Iterator;

public class MainGeneric {
    public static void main(String[] args) {
        Human misha = new Human("Misha", 20);
        Human alena = new Human("Alena", 27);
        Human evgenuy = new Human("Evgenuy", 25);
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Human> list = new ArrayList<>();
        list.add(misha);
        list.add(alena);
        list.add(evgenuy);
        list2.add(10);
        list2.add(15);
        list2.add(12);
        //list2.printElements();
        //System.out.println();
       // list.printElements();
        Iterator<Human> humanIterator = list.iterator();

        for (Human human : list) {
            System.out.println(human);
        }

    }
}
