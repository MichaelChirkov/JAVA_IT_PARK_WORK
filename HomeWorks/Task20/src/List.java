/**
 * Created by Michael on 03.04.2017.
 */
public interface List {

    /**
     * Добавление элемента в начало списка
     * @param element
     * @return true - если места хватило и добавление прошло успешно
     */

    boolean add(int element);

    boolean addToEnd(int element);

    boolean insert(int element, int index);

    boolean removeByIndex(int index);

    void printElements();

    int get(int index);

    /**
     * Находит элемент по значению
     * @param element элемент, который необходимо найти
     * @return номер элемента
     */
    int find(int element);

    void reverse();

    int size();

}