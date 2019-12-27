package capitulo_05;

public class BinarySearch {

    private final int NOT_FOUND = -1;

    public <T extends Comparable<? super T>> int binarySearch(T[] a, T x) {

        int low = 0;
        int high = a.length - 1;
        int mid;

        while (low <= high) {

            mid = (low + high) / 2;

            if (a[mid].compareTo(x) < 0) {
                low = mid + 1;
            } else if (a[mid].compareTo(x) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return NOT_FOUND;
    }

    public <T extends Comparable<? super T>> int binarySearch_dosVias(T[] a, T x) {

        if (a.length == 0) return NOT_FOUND;

        int low = 0;
        int high = a.length - 1;
        int mid;

        while (low < high) {

            mid = (low + high) / 2;

            if (a[mid].compareTo(x) < 0) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        if (a[low].compareTo(x) == 0) return low;

        return NOT_FOUND;
    }
}