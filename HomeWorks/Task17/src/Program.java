/**
 * Created by Michael on 25.03.2017.
 */
public class Program {
    public static void main(String[] args) {

        Human humans[] = new Human[] {
                new Human("Миша",20),
                new Human("Олег",25),
                new Human("Петр",15),
                new Human("Иван",23),
                new Human("Костя",25),
                new Human("Игорь",17),
                new Human("Анастасия",30),
                new Human("Ольга",36),
                new Human("Настя",20),
                new Human(),
        };

        humans[9].setName("Маша"); // использовал другой способ инициализации для тренировки
        humans[9].setAge(19);

        for (int i = 0; i < humans.length; i++){
            System.out.println("Имя = " + humans[i].getName() + " Возраст = " + humans[i].getAge());
        }

        Human temp;
        for(int i = humans.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(humans[j].getAge() > humans[j + 1].getAge()) {
                    temp = humans[j];
                    humans[j] = humans[j + 1];
                    humans[j + 1] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < humans.length; i++){
            System.out.println("Имя = " + humans[i].getName() + " Возраст = " + humans[i].getAge());
        }


    }
}
