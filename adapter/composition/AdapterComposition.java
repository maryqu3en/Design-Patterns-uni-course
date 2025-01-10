public class AdapterComposition implements Standard {
    private final Adaptee adaptee;

    public AdapterComposition(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public double getTemperatureInCelsius() {
        double fahrenheit = adaptee.getTemperatureInFahrenheit();
        return (fahrenheit - 32) * 5 / 9;
    }
}
