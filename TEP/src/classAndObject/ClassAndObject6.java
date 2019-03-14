package classAndObject;

public class ClassAndObject6 {

	public static void main(String[] args) {
		human1 sayem = new human1("sayem", "blk", "blk", "brown", 5, 80.50);
		sayem.eat();
		sayem.sleep();
		sayem.walk();
	System.out.println("*****************************************************");
	human1 minhaz = new human1("minhaz", "gray", "blue", "white", 6, 90.50);
	minhaz.eat();
	minhaz.sleep();
	minhaz.walk();
	minhaz.play();
	System.out.println("*****************************************************");
	human1 safwan = new human1("safwan", "mix", "brown", "black", 7, 100.50);
	safwan.eat();
	safwan.sleep();
	safwan.walk();
	//safwan.play();
	}
	
	
}

class human1{
	String name;
	String hair;
	String eyes;
	String skin;
	int hight;
	double weight;
	
	public human1(String name,String hair,String eyes,String skin, int hight, double weight) {
	this.name= name;
	this.hair=hair;
	this.eyes=eyes;
	this.skin=skin;
	this.hight=hight;
	this.weight=weight;
	
	System.out.println("his name is"+name);
	System.out.println("his hair is"+hair);
	System.out.println("his eyes is"+eyes);
	System.out.println("his skin is"+skin);
	System.out.println("his hight is"+hight);
	System.out.println("his weight is"+weight);
	}
	
	public void eat() {
		System.out.println("if it is 8am eat breakfast");
	}
	public void sleep() {
		System.out.println("if it is 10pm go to sleep");
	}
	public void walk() {
		System.out.println("if it is 6am go to walk");
	}
	
	public void play() {
		System.out.println("if it is tuesday go to soccer");
	}
	
	public void study() {
		System.out.println("if it is sunday go to study");
	}
	
	
	
}


