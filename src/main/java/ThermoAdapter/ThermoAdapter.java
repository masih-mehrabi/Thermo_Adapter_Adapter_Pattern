package ThermoAdapter;

public class ThermoAdapter implements ThermoInterface {
	private FahrenheitThermo thermo = new FahrenheitThermo();
	
	
	public FahrenheitThermo getThermo() {
		return this.thermo;
	}
	@Override
	public double getTempC() {
		
		
		
		double celThermo = (getThermo().getFahrenheitTemperature() - 32.0) * 5 / 9.0;
		
		return celThermo;
	}
}