package pruebaSpring.entities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Musico {
	private InstrumentoMusical instrumento;
	public Musico() {
		InstrumentoMusicalFactory imf=InstrumentoMusicalFactory.getImf();
		this.instrumento=imf.getInstrumento();

	}
	public void tocar() {
		this.instrumento.tocar();
	}
}
