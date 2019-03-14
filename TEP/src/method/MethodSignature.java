package method;

public class MethodSignature {
	
public static void main(String[] args) {
		
	MethodSignature  ms = new MethodSignature();
		ms.m1("selenium", "testing");
		ms.m2(4, 5);
	    ms.m3('D', 'N');
	    ms.m4("method name + parameter = method signature " +"parameter is always local variable");
	}
public void m1(String st, String st1 ){ 
	
		System.out.println(st +" is for "+ st1);
	
}
public void m2(int a,int b){
	System.out.println("total is"+(a+b));
}
public void m3 (char ch,char ch1){
	System.out.println(ch+"  "+ch1); // to print two character, always put space between them.
}

public void m4 (String methodsinature){
	System.out.println(methodsinature); 
}

}
