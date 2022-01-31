package pruebaSpring.entities;

public class Guitarra implements InstrumentoMusical{
public void rasgar() {
	System.out.println("TRIANGGGG");
}

public void tocar() {
	this.rasgar();	
}

}
