package oo_temperatures;

import oo_temperatures.units.TemperatureUnit;

public class Temperature
{
	private double kelvin_value=0.0;

	public Temperature()
	{

	}
	public void setValue(TemperatureUnit unit, double value)
	{
		this.kelvin_value=unit.toKelvin(value);
	}
	public double getValue(TemperatureUnit unit)
	{
		return unit.fromKelvin(this.kelvin_value);
	}
}
