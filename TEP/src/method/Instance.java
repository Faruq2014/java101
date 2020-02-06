package method;

public class Instance {

	public static void main(String[] args) {
		//Instance ins= new Instance();
		//ins.mOne(33);
		/*Instance method are not class related, we must create reference object to access from
		 * static area. 
		 * 
		 */
		Instance no = new Instance();
		no.mOne(20);
		
	}
		public void mOne(int age) {
			
			
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
