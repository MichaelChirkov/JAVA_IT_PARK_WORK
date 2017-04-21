/**
 * Created by Michael on 03.04.2017.
 */
public class ArrayList<T> implements List<T> {
    private static final int MAX_SIZE = 5;
    private int count;
    private Object elements[];

    public ArrayList() {
       elements = new Object[MAX_SIZE];
    }

    public void printElements() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                System.out.print(elements[i] + " ");
            }
        }
    }

    @Override
    public boolean add(T element) {
        if (count < MAX_SIZE){
            for ( int i = elements.length - 2 ; i >= 0; i--){
                elements[i + 1] = elements[i];
            }
            elements[0] = element;
            count++;
            System.out.println("Места хватило, добавление в начало списка прошло успешно!");
            return true;
        }
        else{
            System.err.println("Места не хватило, добавление в список не было выполнено.");
        return false;}
    }

    public boolean addToEnd(T element) {
        if (count < MAX_SIZE) {
            elements[count] = element;
            count++;
            return true;
        } else {
            System.err.println("Места больше нет!");
            return false;
        }
    }


    public boolean insert(T element, int index) {
        if ((index < MAX_SIZE) && (index >= 0) &&(count <= MAX_SIZE) ) {
            if (index != elements.length - 1) {
                for (int i = elements.length - 1; i > index; i--) {
                    elements[i] = elements[i - 1];
                }
                elements[index] = element;
            }
            if (index == elements.length - 1) {
                elements[index] = element;
            }
            return true;
        }

        else {
            System.err.println("Вставка элемента массива не была выполнена");
            return false;
        }
    }

    @Override
    public boolean removeByIndex(int index){
        if (index < MAX_SIZE) {
            for (int i = index; i < elements.length - 1; i++) {
                elements[i] = elements[i + 1];
            }
            System.out.println("Удаление по индексу прошло успешно!");
            return true;
        }
        if (index == elements.length - 1){
            elements[index] = null;
            System.out.println("Удаление по индексу прошло успешно!");
            return true;
        }
        else
            System.err.println("Неправильный индекс.");
            return false;
    }

    @Override
    public T get(int index) {
        int temp = -1;
        for (int i = 0; i < elements.length; i ++){
            if (i == index){
                temp = i;
            }
        }
        if (temp != -1){
            System.out.println("Элемент с таким индексом существует!");
            return (T)elements[index];
        }
        else {
            System.err.println("Элемента с таким индексом не существует");
            return null;
        }
    }

    @Override
    public int find(T element){
        int index = -1;
        for (int i = 0; i < elements.length; i ++){
           if (elements[i] == element){
               index = i;
           }
        }
        if (index != -1){
            System.out.println("Элемент массива с таким значением найден!");
            return index;
        }
        else {
            System.err.println("Элемент массива с таким значением не найден!");
            return -1;
        }
    }

    @Override
    public void reverse() {
        for (int i = 0; i < (elements.length/2); i++ ){
            T temp = (T)elements[elements.length-i-1];
            elements[elements.length-i-1]=elements[i];
            elements[i]=temp;
        }

    }

    @Override
    public int size() {

        return elements.length;
    }
}