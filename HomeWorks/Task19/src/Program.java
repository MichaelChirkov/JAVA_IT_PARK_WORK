/**
 * Created by Michael on 05.04.2017.
 */
public class Program {
    public static void main (String[] args) {

        Cars bmwM3 = new Cars("BMWM3", "к655мп");
        Cars nissanAlmera = new Cars("Nissan Almera", "а523мр");

        Buses goldenBus = new Buses("Golden Bus", "п654ар");
        Buses silverBus = new Buses("Silver bus", "м678ро");
        Bicycle aist = new Bicycle("Аист");

        bmwM3.parking();
        nissanAlmera.parking();
        silverBus.parking();
        System.out.println("На парковке " + ParkingPlace.freePlaces() + " свободных мест");
        bmwM3.unparking();
        System.out.println("На парковке " + ParkingPlace.freePlaces() + " свободных мест");
        aist.parking();



    }
}
