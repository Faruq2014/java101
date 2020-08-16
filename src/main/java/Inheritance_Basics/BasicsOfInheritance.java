package Inheritance_Basics;

public class BasicsOfInheritance {
	/*
	 * What is inheritance? Inheritance is an important pillar of OOP(Object
	 * Oriented Programming). It is the mechanism in java by which one class is
	 * allow to inherit the features(fields and methods) of another class.
	 */
	
	/*What are the important features of inheritance?
	 * 1. Super class
	 * 2. Sub class
	 * 3. Re-usability
	 * 4. Overriding
	 * 5.method hiding 
	 * 
	 */
	
	/*Types of Inheritance in Java
	 * 1. Single inheritance --allow
	 * 2. Multilevel Inheritance--allow
	 * 3. Hierarchical Inheritance--allow
	 * 4. Multiple inheritance -- not allow, but allow for interface
	 * 5. Hybrid Inheritance---not allow, but allow in unheritance
	 * 
	 * 
	 */
	
	/*
	 * Important facts about inheritance in Java
	 * 
	 * Default superclass: Except Object class, which has no superclass, every class
	 * has one and only one direct superclass (single inheritance). In the absence
	 * of any other explicit superclass, every class is implicitly a subclass of
	 * Object class. 
	 * 
	 * Superclass can only be one: A superclass can have any number of
	 * subclasses. But a subclass can have only one superclass. This is because Java
	 * does not support multiple inheritance with classes. Although with interfaces,
	 * multiple inheritance is supported by java.
	 * 
	 *  Inheriting Constructors: A
	 * subclass inherits all the members (fields, methods, and nested classes) from
	 * its superclass. Constructors are not members, so they are not inherited by
	 * subclasses, but the constructor of the superclass can be invoked from the
	 * subclass. 
	 * 
	 * Private member inheritance: A subclass does not inherit the private
	 * members of its parent class. However, if the superclass has public or
	 * protected methods(like getters and setters) for accessing its private fields,
	 * these can also be used by the subclass.
	 */
	
	/*
	 * What all can be done in a Subclass?
	 * 
	 * In sub-classes we can inherit members as is, replace them, hide them, or
	 * supplement them with new members:
	 * 
	 * The inherited fields can be used directly, just like any other fields. We can
	 * declare new fields in the subclass that are not in the superclass. The
	 * inherited methods can be used directly as they are. We can write a new
	 * instance method in the subclass that has the same signature as the one in the
	 * superclass, thus overriding it (as in example above, toString() method is
	 * overridden). We can write a new static method in the subclass that has the
	 * same signature as the one in the superclass, thus hiding it. We can declare
	 * new methods in the subclass that are not in the superclass. We can write a
	 * subclass constructor that invokes the constructor of the superclass, either
	 * implicitly or by using the keyword super.
	 */
}
