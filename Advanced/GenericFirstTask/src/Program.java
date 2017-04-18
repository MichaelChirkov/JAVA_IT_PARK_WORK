/**
 * Created by Michael on 18.04.2017.
 */
public class Program {
    public static void main(String[] args) {
        GenericClass<String> newObject = new GenericClass<String>("Строка");
        GenericClass<Character> newObject2 = new GenericClass<Character>('G');

        System.out.println(newObject.getObject());
        newObject.showClass();
        System.out.println(newObject2.getObject());
        newObject2.showClass();
        Human human = new Human("Misha", 20,65,180);
        GenericClass<Human> newObject3 = new GenericClass<Human>(human);
        newObject3.showClass();
        System.out.println(newObject3.getObject());
    }
}
