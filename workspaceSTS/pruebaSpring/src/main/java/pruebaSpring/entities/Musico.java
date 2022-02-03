package pruebaSpring.entities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Musico {
	@Autowired
	private InstrumentoMusical instrumento;
	
	public void tocar() {
		this.instrumento.tocar();
	}
}
