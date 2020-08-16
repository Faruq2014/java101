package Overriding_access_Modifier;

public class Overridding_Basics {
	/*What is method overriding?
	 * 
	 * Declaring a method in sub class which is already present in parent class is
	 * known as method overriding. Overriding is done so that a child class can give
	 * its own implementation to a method which is already provided by the parent
	 * class. In this case the method in parent class is called overridden method
	 * and the method in child class is called overriding method.
	 * 
	 */
	
	/*advantages of overriding
	 * Method overriding is used to provide the specific implementation of a method 
	 * which is already provided by its superclass.
       Method overriding is used for runtime polymorphism
	 */
	
	/*
	 * Rules for Java Method Overriding The method must have the same name as in the
	 * parent class The method must have the same parameter as in the parent class.
	 * There must be an IS-A relationship (inheritance).
	 * 
	 * Argument list: The argument list of overriding method (method of child class)
	 * must match the Overridden method(the method of parent class). The data types
	 * of the arguments and their sequence should exactly match. Access Modifier of
	 * the overriding method (method of subclass) cannot be more restrictive than
	 * the overridden method of parent class. For e.g. if the Access Modifier of
	 * parent class method is public then the overriding method (child class method
	 * ) cannot have private, protected and default Access modifier,because all of
	 * these three access modifiers are more restrictive than public.
	 * 
	 * private, static and final methods cannot be overridden as they are local to
	 * the class. However static methods can be re-declared in the sub class, in
	 * this case the sub-class method would act differently and will have nothing to
	 * do with the same static method of parent class. Overriding method (method of
	 * child class) can throw unchecked exceptions, regardless of whether the
	 * overridden method(method of parent class) throws any exception or not.
	 * However the overriding method should not throw checked exceptions that are
	 * new or broader than the ones declared by the overridden method. We will
	 * discuss this in detail with example in the upcoming tutorial. Binding of
	 * overridden methods happen at runtime which is known as dynamic binding. If a
	 * class is extending an abstract class or implementing an interface then it has
	 * to override all the abstract methods unless the class itself is a abstract
	 * class.
	 * 
	 */
	
	
	/*Can we override static method?
	 * No, a static method cannot be overridden. It can be proved by runtime polymorphism,
	 * because the static method is bound with class whereas instance method is bound with an object. 
	 * Static belongs to the class area, and an instance belongs to the heap area.
	 * Can we override java main method?
        No, because the main is a static method.
	 */
}
