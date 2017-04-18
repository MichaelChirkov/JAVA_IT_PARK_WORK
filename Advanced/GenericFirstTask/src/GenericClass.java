/**
 * Created by Michael on 18.04.2017.
 */
public class GenericClass<T> {
    T object;

    public GenericClass(T obj) {
        this.object = obj;
    }

    public T getObject() {
        return object;
    }

    public void showClass(){
        System.out.println("Объект " + getObject() + " является членом класса " + object.getClass().toString());
    }
}
