/**
 * Created by Michael on 17.04.2017.
 */
public class ParkingPlace1 {
    int MAX_SIZE = 150;
    private Transport transports[] = new Transport[150];
    private int count = 0;
    public void parking(Transport transport) {
        if (transport instanceof Cars || transport instanceof Buses) {
            for (int i = 0; i < transports.length; i++) {
                if (transports[i] == null) {
                    transports[i] = transport;
                    count++;
                    transport.parking();
                    break;
                }
            }
        }
        else {
            System.err.println("Невозможно припарковать данный объект " + transport.getName());
        }
    }
    public void unparking(String number) {
        int info = 0;
        if (ParkingPlace1.numberVerify(number)) {
            for (int i = 0; i < transports.length; i++) {
                if (transports[i] != null) {
                    if (number == transports[i].getNumber()) {
                        transports[i].unparking();
                        transports[i] = null;
                        count--;
                        info++;
                        break;
                    }
                }
            }
            if (info == 0){
                System.out.println("Машины с данным номером на парковке нет.");
            }
        }
        else {
            System.out.println("Некорректный номер транспортного средства");

        }

    }
    public static boolean numberVerify(String number){
        if (number.length() == 5){
            return true;
        }
        else return false;
    }
}
