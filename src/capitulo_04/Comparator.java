package capitulo_04;

public interface Comparator<T> {
    /**
     * Devuelve el resultado de comparar lhs y rhs.
     * @param lhs primer objeto
     * @param rhs segundo objeto
     * @return < 0 si lhs es menor que rhs,
     * 0 si lhs es igual a rhs,
     * > 0 si lhs es mayor que rhs.
     * @throws ClassCastException
     */
    int compare(T lhs, T rhs) throws ClassCastException;
}
