/**
 * Created by Michael on 19.04.2017.
 */
import static java.lang.System.out;

public class Main {

    public static <T> void print(T T[]) {
        for (int i = 0; i < T.length; i++) {
            out.println(T[i]);
        }
    }

    public static void main(String[] args) {



        House house1 = new House(5, 20, 30);
        House house2 = new House(4, 70, 60);
        House house3 = new House(2, 30, 10);
        House house4 = new House(8, 10, 20);
        House house5 = new House(3, 80, 40);


        Animal animal1 = new Animal("Белыш", "Панда", 10);
        Animal animal2 = new Animal("Зверь", "Мутант", 4);
        Animal animal3 = new Animal("Игорь", "Крот", 2);
        Animal animal7 = new Animal("Флвя", "Собака", 3);
        Animal animal4 = new Animal("Черныш", "Панда", 7);
        Animal animal8 = new Animal("Гонда", "Мутант", 8);
        Animal animal5 = new Animal("Ричард", "Собака", 1);
        Animal animal6 = new Animal("Грей", "Кот", 13);

        Animal[] animals = {animal1, animal2, animal3, animal4, animal5, animal6, animal7,animal8};
        House[] houses = {house1, house2, house3, house4, house5};
        SortClass.sort(houses);
        print(houses);
        ByFlors byFlors = new ByFlors();
        AnimalsByName animalsByName = new AnimalsByName();
        AnimalsByTypeOfAnimal animalsByTypeOfAnimal = new AnimalsByTypeOfAnimal();
        out.println();
        SortClass.sort(houses, byFlors);
        print(houses);
        out.println();
        SortClass.sort(animals);
        print(animals);
        out.println();
        SortClass.sort(animals,animalsByName);
        print(animals);
        out.println();
        SortClass.sort(animals,animalsByTypeOfAnimal);
        print(animals);

    }
}
