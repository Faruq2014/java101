package Inheritance.MultipleLevel;

public class Test {

	public static void main(String[] args) {
		String from = "is from";
		String wife = "is the wife of";
    /* A a = new A();
     String p = a.name("Mannan");
     String w =a.wifeName("Hasina");
     System.out.println(w +" "+ "is the wife of"+" "+p); 
     String p1=  a.country("Bangladesh");
     System.out.println(p +"is from "+p1);
     a.value(55,66.1,77.99f);
     System.out.println("==================================================");
     B b = new B();
     
     b.children("Faruq", "shafiq", "Minu");
     
     b.vechicle(5555, 6666);
     System.out.println("===============================================");
            */       
		
		              C c = new C();
		              A a= new A();
                     String k = a.name("Mannan");
                     String w1 =a.wifeName("Hasina");
                     String p2=  a.country("Bangladesh");
                     System.out.println(w1 +" "+ wife+" "+k);
                     System.out.println(k+" "+ from+" "+p2);
                     System.out.println(w1 +from+" " +p2);
                     a.value(55,66.1,77.99f);
                     System.out.println("+++++++++++++++++++++++++"); 
                     
                      c.children("Faruq","Shafiq","Minu");
                      c.vechicle(5555, 6666);
                      System.out.println("------------------------------");
                      c.grandkids("Fima", "Nisa");
                      c.country("USA");
	
	}
}
