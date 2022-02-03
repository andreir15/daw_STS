package pruebaSpring.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ViolinAdapter implements InstrumentoMusical {
	@Autowired
	private Violin violin;

	public void tocar() {
		this.violin.frotar();	
	}
}
