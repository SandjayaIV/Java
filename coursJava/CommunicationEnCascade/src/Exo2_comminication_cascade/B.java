package Exo2_comminication_cascade;

public class B {
	
	private C c;
	
	public B(C c) {
		this.c=c;
		
	}
	public void envoiMSGB(){
		
		System.out.println("B: Bien recu A!! Dis C tu es la?");
		c.envoiMSGC();
		
	}
	
	
	

}
