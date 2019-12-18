package capitulo_04;

public interface Comparator<T> {
    // Los argumentos son los dos elementos a comparar
    int compare(T lhs, T rhs);
}
