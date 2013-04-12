package temperatures.units;

public class Fahrenheit extends TemperatureUnit
{
	@Override
	public double fromKelvin(double kelvin_value)
	{
		return kelvin_value*9.0/5.0-459.67;
	}
	@Override
	public double toKelvin(double fahrenheit_value)
	{
		return (fahrenheit_value+459.67)*5.0/9.0;
	}
	@Override
	public String getSuffix()
	{
		return "F";
	}

} 
