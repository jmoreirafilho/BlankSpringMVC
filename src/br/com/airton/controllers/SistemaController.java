package br.com.airton.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sistema")
public class SistemaController {
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	private ModelAndView welcome(@RequestParam(value="nome", required=false, defaultValue="Airton")String nome) {
		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("mensagem", "olá "+nome);
		
		return modelAndView;
	}
}
