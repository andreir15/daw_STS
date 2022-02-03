package pruebaSpring;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pruebaSpring.entities.Musico;
import pruebaSpring.entities.MusicoCutre;


public class Main {

	public static void main(String[] args) throws FileNotFoundException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		System.out.println("Hola mundo");
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

		MusicoCutre mc=(MusicoCutre)context.getBean("musico");
		
		//Musico musico=new Musico();
		
		mc.tocar();
	}

}
