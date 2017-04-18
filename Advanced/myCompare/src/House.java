/**
 * Created by Michael on 19.04.2017.
 */
public class House implements Comparable<House> {
    int floors;
    int height;
    int weight;

    public House(int floors, int height, int weight) {
        this.floors = floors;
        this.height = height;
        this.weight = weight;
    }

    public int getFloors() {
        return floors;
    }

    private int area(){
        return this.height*this.weight;
    }
    @Override
    public int compareTo(House that) {
        return this.area() - that.area();
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
