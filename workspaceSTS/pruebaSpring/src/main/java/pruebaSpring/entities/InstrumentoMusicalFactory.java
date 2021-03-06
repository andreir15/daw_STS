package pruebaSpring.entities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class InstrumentoMusicalFactory {
	private static InstrumentoMusicalFactory imf;
	private InstrumentoMusicalFactory() {
		
	}
	public static InstrumentoMusicalFactory getImf() {
		if(imf==null) {
			imf=new InstrumentoMusicalFactory();
		}
		return imf;
	}
	public InstrumentoMusical getInstrumento(){
		InstrumentoMusical im=null;
		try {
		Properties p=new Properties(); 
		p.load(new FileInputStream("conf.properties"));
		
		im= (InstrumentoMusical)Class.forName(p.getProperty("instrumento")).newInstance();
		
	}
		catch(Exception e) {	
		}
		return im;
	}
}
