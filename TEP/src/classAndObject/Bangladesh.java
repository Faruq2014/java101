package classAndObject;

public class Bangladesh {

	public static void main(String[] args) {

		AirCraft boeing777 = new AirCraft();
		boeing777.passanger=500;
		boeing777.distance=13219;
		boeing777.cruiseSpeed=560;
		boeing777.fuelBurnRate=300.5;
		boeing777.fuelCapacity=171175l;
		
		
		System.out.println("\nWell come to Boeing 777");
		System.out.println("\nWe have "+" " +boeing777.passanger+" "+ "passangers on board ");
		System.out.println("\nWe have "+" " +boeing777.distance+" "+ "miles to Dhaka");
		System.out.println("\nWe are crusing "+" " +boeing777.cruiseSpeed+" "+ "mph");
		System.out.println("\nfuel burn rate "+" " +boeing777.fuelBurnRate+" "+ "mph");
		System.out.println("\nfuel capacity "+" " +boeing777.fuelCapacity+" "+ "gallon");
		boeing777.calculateEndurance();
		boeing777.howLong();


		



		

	
	}

}


 class AirCraft {
	
	int passanger;
	int cruiseSpeed;
	double fuelCapacity;
	double fuelBurnRate;
	double distance;
	
	void calculateEndurance() {
		double endurance;
		endurance=fuelCapacity / fuelBurnRate ;
		System.out.println("\nWe can fload "+endurance +" "+"hours");
	}
	
	void howLong() {
		double hour;
		hour = distance / fuelBurnRate;
		System.out.println("\nIt will take "+hour+" to go Bangladesh");
	}

}

