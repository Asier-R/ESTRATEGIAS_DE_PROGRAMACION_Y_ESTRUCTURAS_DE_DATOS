package capitulo_05;

public class BinarySearch {

    private final int NOT_FOUND = -1;

    public <T extends Comparable <? super T>> int binarySearch(T[] a, T x){

        int low = 0;
        int high = a.length-1;
        int mid;

        while(low <= high){

            mid = (low + high)/2;

            if(a[mid].compareTo(x) < 0){

            }else if(a[mid].compareTo(x) > 0){

            }else{
                return mid;
            }
        }

        return NOT_FOUND;
    }
}
