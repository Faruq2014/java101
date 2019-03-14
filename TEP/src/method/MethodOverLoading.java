package method;

public class MethodOverLoading {

public static void main(String[] args) {
		
	MethodOverLoading  ms = new MethodOverLoading();
		ms.m1(null, "Faruq");
		ms.m1(4, 5);
	    ms.m1('D', 'N');
	}
public void m1(String st, String st1 ){ 
	System.out.println(st+"  "+ st1);
	System.out.println("\"same mathod name but different method signature is called overloading\"");
}
public void m1(int a,int b){
	System.out.println(+(a+b));
}
public void m1 (char ch,char ch1){
	System.out.println(ch+"  "+ch1); // to print two character, always put space between them.
}
}
