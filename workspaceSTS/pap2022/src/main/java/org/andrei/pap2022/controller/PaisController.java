package org.andrei.pap2022.controller;

import java.util.List;

import org.andrei.pap2022.entities.Pais;
import org.andrei.pap2022.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class PaisController {
	@Autowired
	private PaisRepository paisRepository;
	
	@GetMapping("/pais/r")
public String r(ModelMap m) {
		
		List<Pais> paises=paisRepository.findAll();
    m.put("paises", paises);
	
		return "pais/r";
}
	@GetMapping("/pais/c")
	public String c() {
		return "pais/c";
	}
	@PostMapping("/pais/c")
	public String cPost(
			@RequestParam("nombre")
			String nombre
			) {
		paisRepository.save(new Pais(nombre));
		return "redirect:/pais/r";
	}
}
