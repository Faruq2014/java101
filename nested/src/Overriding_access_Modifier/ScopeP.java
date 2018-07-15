package Overriding_access_Modifier;

import java.util.ArrayList;

public class ScopeP {
public void m1(){
	for(int i=0; i<=10; i++){
		if(i%2==0 )continue;// only print odd number	
	System.out.print(i);
	
	}	
	}
void m2(){
	
	ArrayList<Integer> arrlist= new ArrayList<Integer>();
arrlist.add(10);
arrlist.add(15);
arrlist.add(19);
arrlist.add(18);
arrlist.add(80);
arrlist.add(17);
arrlist.add(30);
System.out.println("for loop");
for (int  i=0; i<arrlist.size(); i ++){
System.out.println(arrlist.get(i));
}
}
}
