/**
 * Created by Michael on 19.04.2017.
 */
public class Sort {
    public static void sort(Human comparables[]) {
        for (int i = comparables.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++){
                if (comparables[j].compareTo(comparables[j+1]) > 0){
                    Human temp = comparables[j+1];
                    comparables[j+1] = comparables[j];
                    comparables[j] = temp;
                }
            }
        }
    }
}
