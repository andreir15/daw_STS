package pruebaSpring;

import java.io.FileNotFoundException;
import java.io.IOException;

import pruebaSpring.entities.Musico;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		System.out.println("Hola mundo");
		Musico musico=new Musico();
		musico.tocar();
	}

}
