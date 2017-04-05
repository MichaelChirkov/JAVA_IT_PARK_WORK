/**
 * Created by Michael on 01.04.2017.
 */
public class ParkingPlace {
    static final int MAX_SIZE = 150;
    static String[] parkingPlace = new String[MAX_SIZE];
    static int countPlace = 0;

    static void parking(String transportNumber) {
        if (countPlace < MAX_SIZE) {
            for (int i = 0; i < MAX_SIZE; i++) {
                if (parkingPlace[i] == null) {
                    parkingPlace[countPlace] = transportNumber;
                    System.out.println("Транспорт c гос номером " + transportNumber + " припарковался на месте с номером " + countPlace);
                    countPlace++;
                    break;
                }
            }
        }
        else {
            System.out.println("Все места на парковке заняты");
        }
    }

    static void unparking(String transportNumber) {

        for (int i = 0; i < MAX_SIZE; i++) {
            if (transportNumber == parkingPlace[i]) {
                System.out.println("Транспорт с гос номером " + transportNumber + "уезжает с парковочного места " + i);
                parkingPlace[i] = null;
                countPlace--;
            }
        }
    }

    static int freePlaces(){
        return MAX_SIZE - countPlace + 1;
    }
}



