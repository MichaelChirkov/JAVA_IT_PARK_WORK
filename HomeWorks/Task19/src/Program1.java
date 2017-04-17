/**
 * Created by Michael on 17.04.2017.
 */
public class Program1 {
    public static void main(String[] args) {
        Cars bmwM3 = new Cars("BMWM3", "к655мп");
        Cars nissanAlmera = new Cars("Nissan Almera", "а523мр");

        Buses goldenBus = new Buses("Golden Bus", "п654ар");
        Buses silverBus = new Buses("Silver bus", "м678ро");
        Bicycle aist = new Bicycle("Аист");
        Cars bmw = new Cars("BMWM3", "к655мп");

        ParkingPlace1 parkingPlace = new ParkingPlace1();
        parkingPlace.parking(bmwM3);
        parkingPlace.unparking("к655мп");
        parkingPlace.parking(aist);
        parkingPlace.parking(goldenBus);
        parkingPlace.unparking("fdfs88888");
        parkingPlace.unparking("fdfs8");
        if (bmwM3.equals(bmw)){
            System.out.println("Машины одинаковы");
        }
        else {
            System.out.println("Машины разные");
        }
    }
}
