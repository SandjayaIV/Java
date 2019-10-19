package Exo2_comminication_cascade;

public class MainClass {

	public static void main(String[] args) {
	
    	C c= new C(); 
		B b=new B(c);
		A a=new A(b);
		
		
		//A a=new A(new B(new C()));
		a.envoiMSGA();
		

	}

}
