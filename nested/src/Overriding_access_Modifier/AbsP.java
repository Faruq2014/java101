package Overriding_access_Modifier;

public class AbsP {
public void m1(){char[]	faruq={'F','A','R','U','Q'};
for (int i=0;i<faruq.length;i++){
	for(int j=0; j<=i; j++){
		System.out.print(faruq[j]);
	}
	System.out.println(" ");
}
}
/*
 * we also can non abstract method to abstract method.in this AbsP parent 
 * method we make m1 as a regular method but AbsC child method 
 * we will make it abstract method.
 */
public static void main(String[]args){
	AbsP p = new AbsP();
	p.m1();
}
}
