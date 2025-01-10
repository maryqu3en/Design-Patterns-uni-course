public class Client {
    public static void main(String[] args) {
        Standard adapter = new AdapterInheritance();
        System.out.println("Temperature in Celsius: " + adapter.getTemperatureInCelsius());
    }
}
