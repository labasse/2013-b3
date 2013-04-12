package temperatures.units;

public class Kelvin extends TemperatureUnit
{
	@Override
	public double fromKelvin(double kelvin_value)
	{
		return kelvin_value;
	}
	@Override
	public double toKelvin(double kelvin_value)
	{
		return kelvin_value;
	}
	@Override
	public String getSuffix()
	{
		return "K";
	}
} 
