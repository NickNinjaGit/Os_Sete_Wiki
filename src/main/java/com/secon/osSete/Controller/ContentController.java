package com.secon.osSete.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.secon.osSete.Services.BookService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class ContentController {
	
	@RequestMapping("/index")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("login");
	    return modelAndView;
	}
	
	
	@RequestMapping("/req/signup")
	public ModelAndView signup() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("signup");
		return modelAndView;
	}
	
	@RequestMapping("/wikis/bento")
	public ModelAndView bento() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("wikis/bento/main");
		return modelAndView;
		
	}
	
	@RequestMapping("/wikis/filhosDeSetimo")
	public ModelAndView filhosDeSetimo() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("wikis/filhos_de_setimo/main");
		return modelAndView;
		
	}
	
	@RequestMapping("/wikis/livroDeJo")
	public ModelAndView livroDeJo() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("wikis/livro_de_jo/main");
		return modelAndView;
		
	}
	
	@RequestMapping("/wikis/osSete")
	public ModelAndView osSete() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("wikis/os_sete/main");
		return modelAndView;
		
	}
	
	@RequestMapping("/wikis/revelacoes")
	public ModelAndView revelacoes() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("wikis/revelacoes/main");
		return modelAndView;
		
	}
	
	@RequestMapping("/wikis/senhorDaChuva")
	public ModelAndView senhorDaChuva() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("wikis/senhor_da_chuva/main");
		return modelAndView;
		
	}
	
	@RequestMapping("/wikis/setimo")
	public ModelAndView setimo() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("wikis/setimo/main");
		return modelAndView;
		
	}
	
	@RequestMapping("/wikis/vampirosRioDouro")
	public ModelAndView vampirosRioDouro() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("wikis/vampiros_rio_douro/main");
		return modelAndView;
		
	}
	
	@RequestMapping("/wikis/autor")
	public ModelAndView autor() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("wikis/autor");
		return modelAndView;
	}
	
	
}


