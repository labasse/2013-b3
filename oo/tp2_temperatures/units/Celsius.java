package oo_temperatures.units;

class Celsius extends TemperatureUnit
{
	@override
	public double fromKelvin(double kelvin_value)
	{
		return kelvin_value-273.15;
	}
	@override
	public double toKelvin(double celsius_value)
	{
		return celsius_value+273.15;
	}
} 
