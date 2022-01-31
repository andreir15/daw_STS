package pruebaSpring.entities;

public class Trompeta implements InstrumentoMusical{
    public void calentar() {
	System.out.println("CALENTANDO");
}
    public void sonar() {
    	System.out.println("TURURU");
    }
	public void tocar() {
		this.calentar();
		this.sonar();
		
	}
}
