package Overriding_return_type;

public class RunTime2 extends RunTime1
 {
	RunTime2 wealth(double cash,double land){
		int salary = 1000*12;
		double total = (cash+land)/3+salary;
		System.out.println(" inherit from father and own"+" "+total);
		return this;
	}
	public static void main(String[]args){
		RunTime2 a2=new RunTime2();
		a2.wealth(4, 5);
		
	}
}
// to override, method signature must be the same in both 
// parent and child classes.