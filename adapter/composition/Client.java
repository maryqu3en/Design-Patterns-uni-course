public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Standard adapter = new AdapterComposition(adaptee);
        System.out.println("Temperature in Celsius: " + adapter.getTemperatureInCelsius());
    }
}
