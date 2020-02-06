package classAndObject;

public class WithoutParaMeter {

	public static void main(String[] args) {
		human faruq = new human();
		faruq.hand=2;
		faruq.leg=2;
		faruq.hair=400000.44d;
		System.out.println("Faruq has"+faruq.hand +"hand");
		System.out.println("Faruq has"+faruq.leg+"leg");
		System.out.println("Faruq has"+faruq.hair+"hair");
		faruq.marry(25);
		
		faruq.athelatic(5.4);
		
		System.out.println("***********************");
		
		human hilary = new human();
		hilary.hand=3;
		hilary.leg=5;
		hilary.hair=200000.34;
		hilary.gender="female";
		System.out.println("hilary has"+hilary.hand +"hand");
		System.out.println("hilary has"+hilary.leg+"leg");
		System.out.println("hilary has"+hilary.hair+"hair");
		System.out.println("hilary is a"+hilary.gender);
		hilary.marry(19);
		
	}


}


class human{
	/*
	 * rq#1--> hand,leg,hair, gender.
	 * rq#2--> mary after 20
	 * rq#3-->athelatic
	 * 
	 */
	int hand;
	int leg;
	double hair;
	String gender;
	
	
	public void marry(int age) {
	
		if(age>20) {
		System.out.println("you should get marry");	
		}else {
			System.out.println("you are under age and should not get marry yet.");
		}
	}
		public void athelatic(double hight) {
			
			if(hight>6.5) {
			System.out.println("you should play basketball");	
			}else {
				System.out.println("you should play soccer.");
			}
	}
}