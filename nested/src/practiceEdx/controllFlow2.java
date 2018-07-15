package practiceEdx;

public class controllFlow2 {

	public static void main(String[] args) {
		 System.out.println("start main");
	        method1();
	        method2();
	        method3();
	        System.out.println("end main");

	}
	 public static void method1() {
	        System.out.println("enter method1");
	        method2();
	        System.out.println("end method1");
	    }

	    public static void method2() {
	        System.out.println("enter/end method2");
	    }

	    public static void method3() {
	        System.out.println("enter method3");
	        method1();
	        System.out.println("end method3");
	    }

}
