/**
 * Created by Michael on 18.04.2017.
 */
enum DaysofWeek{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        }
public class Program {
    public static void main(String[] args) {


        DaysofWeek daysofWeek = DaysofWeek.Monday;
        DaysofWeek[] allDays = DaysofWeek.values();
        DaysofWeek oneDay = DaysofWeek.valueOf("Friday");

        for (DaysofWeek day : allDays) {
            System.out.println(day + " " + day.ordinal());
        }

        System.out.println(oneDay);

    }
}
