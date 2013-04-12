UNITS_CLASS=temperatures/units/TemperatureUnit.class temperatures/units/Celsius.class temperatures/units/Kelvin.class temperatures/units/Fahrenheit.class
UNITS_JAVA =temperatures/units/TemperatureUnit.java temperatures/units/Celsius.java temperatures/units/Kelvin.java temperatures/units/Fahrenheit.java

temperatures.jar : temperatures/Temperature.class $(UNITS_CLASS)
	jar cvf temperatures.jar $(UNITS_CLASS)

temperatures/Temperature.class : temperatures/Temperature.java $(UNITS_CLASS)
	javac temperatures/Temperature.java

temperatures/units/TemperatureUnit.class : $(UNITS_JAVA)
	javac $(UNITS_JAVA)

clean:
	rm -rf *.class
