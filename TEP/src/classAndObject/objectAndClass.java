package classAndObject;

public class objectAndClass {

	public static void main(String[] args) {
		human faruq = new human();
		faruq.hand=2;
		faruq.leg=2;
		faruq.hair=400000.44d;
		System.out.println("Faruq has"+faruq.hand +"hand");
		System.out.println("Faruq has"+faruq.leg+"leg");
		System.out.println("Faruq has"+faruq.hair+"hair");
		faruq.marry(25);
		
		System.out.println("***********************");
		
		human hilary = new human();
		hilary.hand=3;
		hilary.leg=5;
		hilary.hair=200000.34;
		hilary.sex="female";
		System.out.println("hilary has"+hilary.hand +"hand");
		System.out.println("hilary has"+hilary.leg+"leg");
		System.out.println("hilary has"+hilary.hair+"hair");
		System.out.println("hilary is a"+hilary.sex);
		hilary.marry(19);
	}

}


class human{
	int hand;
	int leg;
	double hair;
	String sex;
	
	
	public void marry(int age) {
	
		if(age>20) {
		System.out.println("you should get marry");	
		}else {
			System.out.println("you are under age and should not get marry yet.");
		}
	}
}