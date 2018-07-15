package nested;

import java.util.Scanner;

public class aircondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    aircondition a = new aircondition();
    a.analog();
    a.digital();
	}
public static void analog(){
	int temp;
	Scanner input = new Scanner (System.in);
	System.out.println("turn the switch 1,2 or 3");
	temp= input.nextInt();
	switch (temp){
	case 1:System.out.println("turn heater on");break;
	case 2:System.out.println("turn fan on");break;
	case 3:System.out.println("turn a/c on");break;
	default:System.out.println("turn it off");break;
	
	}

	}
	public void digital(){
		int temp;
		Scanner input = new Scanner(System.in);
		System.out.println("what is the room temp");
		temp= input.nextInt();
	if(temp <60){System.out.println("turn heater on");}
	else if(temp>=60 && temp <70){System.out.println("nice weather,pause");}
	else if(temp>=70 && temp <80){System.out.println("fan on");}
	else if(temp>=80 && temp >90){System.out.println("a/c on");}
	else{System.out.println("turn off");}
	}
	
	
	
	

}
