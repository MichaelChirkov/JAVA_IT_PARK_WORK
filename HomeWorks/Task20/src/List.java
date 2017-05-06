/**
 * Created by Michael on 03.04.2017.
 */
public interface List<T> {

    /**
     * Добавление элемента в начало списка
     * @param element
     * @return true - если места хватило и добавление прошло успешно
     */

    boolean add(T element);

    boolean addToEnd(T element);

    boolean insert(T element, int index);

    boolean removeByIndex(int index);

    void printElements();

    T get(int index);

    /**
     * Находит элемент по значению
     * @param element элемент, который необходимо найти
     * @return номер элемента
     */
    int find(T element);


    void reverse();

    int size();
}