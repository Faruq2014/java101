package Overriding_access_Modifier;

public abstract class Absc extends AbsP {
public abstract void m1();
	/*
	 * why should we make a non abstract method abstract:
	 * to stop the parent class implementation. so next child 
	 * can inherit the method and override it but can not 
	 * inherit the same implementation.
	 * foot note: if a class has one abstraction method,
	 * you must declare as a abstract class. like  abstract class Absc.
	 */

	
}
