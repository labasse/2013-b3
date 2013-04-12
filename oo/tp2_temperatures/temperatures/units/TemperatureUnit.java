package temperatures.units;

public abstract class TemperatureUnit
{
	public abstract double fromKelvin(double kelvin_value);
	
	public abstract double toKelvin(double specific_unit_value);

	public abstract String getSuffix();

	public static double convert(double value, TemperatureUnit from, TemperatureUnit to)
	{
		return to.fromKelvin(from.toKelvin(value));		
	}
} 
