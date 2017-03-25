/**
 * Created by Michael on 26.03.2017.
 */
public class Program {
    public static void main(String[] args) {

        Human humans[] = new Human[] {
                new Human("Misha",20),
                new Human("Oleg",25),
                new Human("Petr",15),
                new Human(),
        };

        humans[3].setName("Masha"); // использовал другой способ инициализации для тренировки
        humans[3].setAge(19);

        for (int i = 0; i < humans.length; i++){
            System.out.println("Имя = " + humans[i].getName() + " Возраст = " + humans[i].getAge());
        }

        int[] array = new int[121]; // от 1 до 121, т.к. возраст 0 лет - нету.
        for (int i = 1; i < array.length; i++ ){
            array[i] = 0;
        }

        for (int i = 1; i < array.length; i++ ){
            for (int j = 0; j < humans.length; j++){
                if (humans[j].getAge() == i){
                    array[i]++;
                }
            }
        }
        //вывод, большой, потому что выровнял
        System.out.println();
        System.out.println("Возраст кол-во");
        for (int i = 1; i < array.length; i++) {
            if ( i < 10) {
                System.out.println(i + "         " + array[i]);
            }
            else {
                if ((10 <= i) && (i < 100)) {
                    System.out.println(i + "        " + array[i]);
                }
                else {
                    if (i >= 100) {
                        System.out.println(i + "       " + array[i]);
                    }
                }
            }
        }
    }
}
