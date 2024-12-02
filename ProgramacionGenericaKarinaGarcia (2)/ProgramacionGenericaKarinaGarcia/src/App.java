public class App {
    public static void main(String[] args) throws Exception {
        Contenedor<String> contenedorString = new Contenedor<>("Karina Garcia");
        System.out.println("Dato almacenado String: " + contenedorString.getDato());
        Contenedor<Integer> contenedorInteger = new Contenedor<>(15);
        System.out.println("Dato almacenado Integer: " + contenedorInteger.getDato());
        Contenedor<Double> contenedorDouble = new Contenedor<>(3.14159);
        System.out.println("Dato almacenado Double: " + contenedorDouble.getDato());
        
    }
}
