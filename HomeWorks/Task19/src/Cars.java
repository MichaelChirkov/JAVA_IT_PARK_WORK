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

    public static void parking(String[] place, String numberOfTransport){
        for ( int i = 0; i < place.length; i++){
            if (place[i] == null){
                place[i] = numberOfTransport;
                System.out.println("Машина " +  );
            }
        }
    }

    public void unparking() {

    }
}
