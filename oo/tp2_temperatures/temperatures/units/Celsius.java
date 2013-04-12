package temperatures.units;

public class Celsius extends TemperatureUnit
{
	@Override
	public double fromKelvin(double kelvin_value)
	{
		return kelvin_value-273.15;
	}
	@Override
	public double toKelvin(double celsius_value)
	{
		return celsius_value+273.15;
	}
	@Override
	public String getSuffix()
	{
		return "C";
	}
} 
