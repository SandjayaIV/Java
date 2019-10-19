package Exo2_comminication_cascade;

public class A {
	
	private B b;
	
	public A(B b){
		this.b=b;
		}
	
	public void envoiMSGA(){
		
		System.out.println("A: Salut c'est moi qui initie le dialogue");
		b.envoiMSGB();
		
	}
	
	

}
