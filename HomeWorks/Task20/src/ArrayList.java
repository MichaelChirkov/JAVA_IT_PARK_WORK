/**
 * Created by Michael on 03.04.2017.
 */
public class ArrayList implements List {
    private static final int MAX_SIZE = 5;
    private int count;
    private int elements[];

    public ArrayList() {
        elements = new int[MAX_SIZE];
    }

    public void printElements() {
        for (int i = 0; i < elements.length; i++){
            System.out.print(elements[i] + " ");
        }
    }

    @Override
    public boolean add(int element) {
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

    public boolean addToEnd(int element) {
        if (count < MAX_SIZE) {
            elements[count] = element;
            count++;
            return true;
        } else {
            System.err.println("Места больше нет!");
            return false;
        }
    }


    public boolean insert(int element, int index) {
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
            elements[index] = 0;
            System.out.println("Удаление по индексу прошло успешно!");
            return true;
        }
        else
            System.err.println("Неправильный индекс.");
            return false;
    }

    @Override
    public int get(int index) {
        int temp = -1;
        for (int i = 0; i < elements.length; i ++){
            if (i == index){
                temp = i;
            }
        }
        if (temp != -1){
            System.out.println("Элемент с таким индексом существует!");
            return elements[index];
        }
        else {
            System.err.println("Элемента с таким индексом не существует");
            return -1;
        }
    }

    @Override
    public int find(int element){
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
            int temp = elements[elements.length-i-1];
            elements[elements.length-i-1]=elements[i];
            elements[i]=temp;
        }

    }

    @Override
    public int size() {

        return elements.length;
    }
}