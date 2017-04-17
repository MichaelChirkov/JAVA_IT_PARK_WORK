/**
 * Created by Michael on 01.04.2017.
 */
public class Bicycle extends Transport {
    public Bicycle(String modelName) {
        super(modelName);

    }

    public String getNumber() {
        return null;
    }

    public String getName() {
        return this.modelName;
    }

    public void parking() {
        System.out.println("Я велосипед, я не умею парковаться :-)");

    }

    public void unparking() {

    }

    public boolean equals(Object obj) {
        if (obj instanceof Bicycle) {
            Bicycle that = (Bicycle) obj;
            return (this.modelName == that.modelName);
        }
        else return false;
    }

    public String toString() {
        return "Bicycle{" +
                "modelName='" + modelName + '\'' +
                '}';
    }
}



