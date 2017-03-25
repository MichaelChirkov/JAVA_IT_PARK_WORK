/**
 * Created by Michael on 25.03.2017.
 */
public class Human {

    private String name;
    private int age;

    public Human(){
        this.name = "";
        this.age = 0;
    }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
