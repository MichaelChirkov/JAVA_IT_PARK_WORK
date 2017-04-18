/**
 * Created by Michael on 19.04.2017.
 */
public class Animal implements Comparable<Animal> {
    String name;
    String typeOfAnimal;
    int age;

    public Animal(String name, String typeOfAnimal, int age) {
        this.name = name;
        this.typeOfAnimal = typeOfAnimal;
        this.age = age;
    }

    public int getTypeOfAnimalLenght() {
        return typeOfAnimal.length();
    }

    public int getNameLenght() {
        return name.length();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", typeOfAnimal='" + typeOfAnimal + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Animal that) {
        return this.age - that.age;
    }
}
