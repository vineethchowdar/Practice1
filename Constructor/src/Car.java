
public class Car {
	String vin;
	String make;
	String model;

	Car(String vinNumber, String makeOfTheCar, String modelOfTheCar)
	{
	vin=vinNumber;
	make=makeOfTheCar;
	model=modelOfTheCar;
	}
	void start()
	{
		System.out.println("starting"+" " + vin +" " + make +" " + " " + model);
	}
	void stop()
	{
		System.out.println("stopping" + vin + make + " " + model);
	}
		
		}

