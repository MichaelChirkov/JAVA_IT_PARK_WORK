/**
 * Created by Michael on 01.04.2017.
 */
public class Cars extends  Transport implements ParkingObject {
    public Cars(String modelName, String number) {
        super(modelName, number);
    }


    public String getNumber() {
        return this.number;
    }

    public  String getName(){
        return this.modelName;
    }

    public void parking(){
        System.out.println("Водитель: Я приехал на " + this.getName() + " с гос. номером " + getNumber());

    }

    public void unparking() {
        System.out.println("Водитель: Я уезжаю на " + this.getName() + " с гос номером " + getNumber());
    }
    public boolean equals(Object obj) {
        if (obj instanceof Cars) {
            Cars that = (Cars) obj;
            return (this.modelName == that.modelName) && (this.getNumber() == that.getNumber());
        }
        else return false;
    }

    public String toString() {
        return "Cars{" +
                "modelName='" + modelName + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
