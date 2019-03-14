package method;

public class InnerMethodCalling {

	
	public void molla(){
		System.out.println("number 1"); // one method calling another
		chowdhory();  
		sha();  // one method can call multiple method
		InnerMethodCalling.khan();
	}
	public void chowdhory(){
		System.out.println("number 2");
		sha();
	}
	public void sha(){
		System.out.println("number 3");
		InnerMethodCalling.khan();
		 
	}
	public static void khan(){
		System.out.println("number 4");
		InnerMethodCalling imc = new InnerMethodCalling();
		imc.m5();
	}
	public void m5(){
		System.out.println(" calling all the methods");
		
		
	}

		public static void main(String[] args) {
			
			InnerMethodCalling imc = new InnerMethodCalling();
		imc.molla();	
		}

}
