/**
 * Created by Michael on 01.04.2017.
 */
public abstract class Transport implements ParkingObject {

    protected String modelName;
    protected String number;

    public Transport(String modelName) {
        this.modelName = modelName;
    }

    public Transport(String modelName, String number) {
        this.modelName = modelName;
        this.number = number;
    }

  /*  public boolean equals(Object object) {
        if (object != null && object instanceof Transport) {
            Transport that = (Transport)object;
            return this.age == that.age
                    && this.height == that.height
                    && this.name == that.name;
        } return false;
    } */

    public String toString() {
        return this.modelName;
    }

}
