package loop;

public class while_do_for {

	/*public static void main(String[] args) {
		int x=0;
		while (x<10){
			x++;
		System.out.println("the count is" + " "+ x);}
	}

	//while argument is true(x is less than 10) loop execute the code x++, as soon as it s found x is 11
	//which is false, loop stop the execution.
	*/
	public static void main(String[] args) {
		int y = 10;
		do{System.out.println(y);
			y++;}
			while (y<9);
		
	}
//on the other hand do loop execute the code first (y++) than its goes to see if the condition is true 
//	or false. even the condition is false loop will execute at least once.
	
	
	public static void  forLoop(String[] args) {
		
		for (int a = 0; a <=10; a++) {System.out.println(a);
			
		}
	}
//for loop is easier same as while loop but easier to execute.
	



}
