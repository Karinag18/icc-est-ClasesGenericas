public class Contenedor<T> {
    private T dato;

    public Contenedor(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Contenedor{" + "dato=" + dato + '}';
    }
}
