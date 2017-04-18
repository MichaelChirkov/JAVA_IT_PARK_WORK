import java.util.Comparator;

/**
 * Created by Michael on 19.04.2017.
 */
public class SortClass {

    public static void sort(Comparable comparables[]){
        sort(comparables, null);
    }

    public static <T> void sort(T T[], Comparator comparator) {
        boolean hasComparator = comparator != null;
        for (int i = T.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                int compareResult = 0;
                if (hasComparator) {
                    compareResult = comparator.compare(T[j], T[j + 1]);
                }
                else {
                    Comparable A = (Comparable)T[j];
                    Comparable B = (Comparable)T[j+1];
                    compareResult = A.compareTo(B);
                }
                if (compareResult > 0) {
                    T temp = T[j];
                    T[j] = T[j+1];
                    T[j+1] = temp;
                }
            }
        }
    }

}
