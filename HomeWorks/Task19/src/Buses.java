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

    public void parking() {

    }

    public void unparking() {

    }
}
