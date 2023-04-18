package ThermoAdapter;

public class CelsiusThermo implements ThermoInterface {
	
	public double getTempC() {
		throw new IllegalStateException("Someone stepped on the Celsius Thermometer. It is not working :(");
	}
}