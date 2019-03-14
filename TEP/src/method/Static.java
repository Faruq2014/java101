package method;

public class Static {

	public static void main(String[] args) {
		Static.mOne(31);
/*static method are class related, we do not need to create object to access from 
 * static block. 
 * 
 */
	}
public static void mOne(int age) {
	
	
	if(age >=25) {
		System.out.println("you can run for congress office");
	}else {System.out.println("you are too young for congress office"); }
	
	if(age >=30) {
		System.out.println("you can run for seneate office");
	}else {System.out.println("you are too young for seneate office"); }
	 
	if(age >=35) {
			System.out.println("you can run for president office");
		}else {System.out.println("you are too young for president office"); }
	
	}

}

