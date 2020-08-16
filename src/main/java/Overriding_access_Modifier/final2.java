package Overriding_access_Modifier;

public class final2 extends Final1{
//public void m1(){}
 // can not over ride final method.
 
public final void m2(){
	for (int i= 50; i >=0; i--){
		if(i==40)break;
		System.out.print(i+" ");
	}	
}
public static void main(String[]args){
	final2 t = new final2();
	t.m1();
	t.m2();
}
}
