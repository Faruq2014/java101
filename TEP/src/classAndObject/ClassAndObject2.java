package classAndObject;

public class ClassAndObject2 {

	public static void main(String[] args) {
	Car camry = new Car("camry", 4, 22000.33);
	camry.logivity(20);
	System.out.println("*********************");
	Car honda = new Car("honda", 6, 22000.33);
	honda.logivity(8);
	System.out.println("*********************");
	Car ford = new Car("ford", 8, 22000.33);
	ford.logivity(6);
	}

}






class Car{
	String name;
	int silinder;
	double value;
	
	public Car(String name, int silinder, double value) {
		this.name=name;
		this.silinder=silinder;
		this.value= value;
		System.out.println("the car name is"+name);
		System.out.println("the car has"+silinder+"silinder");
		System.out.println("the car value"+value);
		
	}
	
	public void logivity(int year) {
	if(year>=10) {
	System.out.println(name+"is a good car");}
	else  {
		System.out.println(name+" "+"is a bad car");
	}
	}
}