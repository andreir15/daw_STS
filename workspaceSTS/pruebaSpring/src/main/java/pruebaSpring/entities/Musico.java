package pruebaSpring.entities;

public class Musico {
	/*
   private Trompeta trompeta;
	
   public Musico() {
		this.trompeta=new Trompeta();
	}
   public void tocar() {
	
	this.trompeta.calentar();
	this.trompeta.sonar();
  }*/
	private InstrumentoMusical instrumento;
	public Musico() {
	this.instrumento=new Trompeta();
	}
	public void tocar() {
		this.instrumento.tocar();
	}
}
