/**
 * Created by Michael on 01.04.2017.
 */
public class Buses extends Transport implements ParkingObject {
    public Buses(String modelName, String number) {
        super(modelName, number);
    }

    public String getNumber() {
        return this.number;
    }

    public String getName() {
        return this.modelName;
    }

    public void parking(){
        System.out.println("Водитель: Я приехал на " + this.getName() + ". Паркуюсь!!!");

    }

    public void unparking() {
        System.out.println("Водитель: Хочу уехать");
    }

    public boolean equals(Object obj) {
        if (obj instanceof Buses) {
            Buses that = (Buses) obj;
            return (this.modelName == that.modelName) && (this.getNumber() == that.getNumber());
        }
        else return false;
    }

    public String toString() {
        return "Buses{" +
                "modelName='" + modelName + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
