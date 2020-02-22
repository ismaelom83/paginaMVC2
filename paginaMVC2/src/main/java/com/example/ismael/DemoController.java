package com.example.ismael;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/login")
	public String login() {
		return "loginForm";
	}
	
	@PostMapping("/login")
	private String lofinForm(Model modelo,Usuario usuario) {
		
		String resultado = "";
		
		if (usuario.getUsuario().isEmpty() || usuario.getPassword().isEmpty()) {
			resultado = "los dos campos son obligatorios";
		}else {
			resultado = "puedes entrar sin problemas al menu";
		}
		
		modelo.addAttribute("mensaje",resultado);
		return "menu";

	}
	
}
