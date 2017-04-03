/**
 * Created by Michael on 01.04.2017.
 */
public class ParkingPlace {
    static final int MAX_SIZE = 150;
    String[] parkingplace = new String[MAX_SIZE];



        public static void main (String[] args) {

            Cars bmwM3 = new Cars("BMWM3", "к655мп");
            Cars nissanAlmera = new Cars("Nissan Almera", "а523мр");

            Buses goldenBus = new Buses("Golden Bus", "п654ар");
            Buses silverBus = new Buses("Silver bus", "м678ро");

            Transport transport[] = {bmwM3,
                    nissanAlmera,
                    goldenBus,
                    silverBus
            };


        }


}
