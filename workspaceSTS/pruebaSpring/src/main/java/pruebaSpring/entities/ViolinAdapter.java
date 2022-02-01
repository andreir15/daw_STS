package pruebaSpring.entities;

public class ViolinAdapter implements InstrumentoMusical {
	private Violin violin;
	public ViolinAdapter() {
		this.violin=new Violin();
	}
	public void tocar() {
		this.violin.frotar();	
	}
}
