package method;

public class Method_overridding extends method_calling {

	public static void main(String[] args) {
		Method_overridding mo= new Method_overridding();
       mo.mOne();
	}

	 void mOne (){  // same method name from parent class.
			String en = "mona";
			int hour = 35; int wage = 10;  // change wage = 10.
			int total = hour* wage;
			System.out.println(en+" "+ hour+" "+wage+" "+total);
			
			// if child class any property of parent class is called method overriding.
			//but can not over ride static method. because static means common. static 
			// method is belong to class and common for whole class. if you have to change
			// then change it at the parent class.
			}
}
