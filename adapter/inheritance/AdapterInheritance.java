public class AdapterInheritance extends Adaptee implements Standard {

    @Override
    public double getTemperatureInCelsius() {
        double fahrenheit = getTemperatureInFahrenheit();
        return (fahrenheit - 32) * 5 / 9;
    }
}
// implements Standard that is expected by the client