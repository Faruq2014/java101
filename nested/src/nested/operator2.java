package nested;

public class operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   operator2 t = new operator2();
   t.m();
	}

	public void m(){
		int boyage=22;
		int girlage=30;
		if(boyage<21 && girlage <18){
			System.out.println("can not marry");
		}else{
		if(boyage >21 && girlage >18){System.out.println("can marry");}
		if(boyage == girlage ){System.out.println("can marry but too close");}
		if(boyage < girlage ){System.out.println("can marry but not a good match");}
	
		
		}
	
	
	}
}
