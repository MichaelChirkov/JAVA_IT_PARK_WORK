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
        ParkingPlace.parking(this.getNumber());
    }

    public void unparking() {
        System.out.println("Водитель: Хочу уехать");
        ParkingPlace.unparking(this.getNumber());

    }
}
