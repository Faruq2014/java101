package method;

public class method_signatureAnd_overloading {

	public static void main(String[] args) {
		
		method_signatureAnd_overloading  ms = new method_signatureAnd_overloading();
		ms.m1(null, "Faruq");
		ms.m1(4, 5);
	    ms.m1('D', 'N');
	}
public void m1(String st, String st1 ){ 
	System.out.println(st+"  "+ st1);
}
public void m1(int a,int b){
	System.out.println("same mathod name but different method signature is called overloading"+(a+b));
}
public void m1 (char ch,char ch1){
	System.out.println(ch+"  "+ch1); // to print two character, always put space between them.
}
}
