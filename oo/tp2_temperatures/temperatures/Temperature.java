package temperatures;

import temperatures.units.TemperatureUnit;
import temperatures.units.Celsius;
import temperatures.units.Fahrenheit;
import temperatures.units.Kelvin;

public class Temperature
{
	private double kelvin_value=0.0;

	public Temperature()
	{

	}
	public Temperature(TemperatureUnit unit, double value)
	{
		this.kelvin_value=unit.toKelvin(value);		
	}

	public void setValue(TemperatureUnit unit, double value)
	{
		this.kelvin_value=unit.toKelvin(value);
	}
	public double getValue(TemperatureUnit unit)
	{
		return unit.fromKelvin(this.kelvin_value);
	}
	public String toString(TemperatureUnit unit)
	{
		return Math.round(unit.fromKelvin(this.kelvin_value)*10.0)/10.0+"°"+unit.getSuffix();
	}
	public static void main(String [] args)
	{
		TemperatureUnit 
			celsius=new Celsius(),
			kelvin =new Kelvin(),
			fahrenheit=new Fahrenheit();
		Temperature boil=new Temperature(celsius, 100.0);

		System.out.println(boil.toString(celsius)+" = "+boil.toString(kelvin)+" = "+boil.toString(fahrenheit));
	}
}
