package nested;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dice1;
int dice2;
int roll;

dice1 = (int)(Math.random()*6)+1;
dice2 = (int)(Math.random()*6)+1;
roll= dice1+dice2;

System.out.println("your first dice comes up " + dice1);
System.out.println("your second dice comes up " + dice2);
System.out.println("your total roll is " + roll);
	}

}
