package nested;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
operators o = new operators();
o.marriage();
	}
	
	public void marriage(){
		int boyage = 20;
		int girlage =44;
		
		if(girlage ==18 && boyage ==21){System.out.println("can  marry");}
		else if(boyage <21 && girlage <18){System.out.println("can not marry");}
		else if(boyage<21 || girlage <18){System.out.println("can not marry");}
		else if(boyage>=21 && girlage >=18){System.out.println("can marry");}
		
		else{System.out.println("what should i do");}
		
	}

}
