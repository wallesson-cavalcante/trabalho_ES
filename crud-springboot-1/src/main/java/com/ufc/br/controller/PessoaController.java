package com.ufc.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import org.springframework.web.bind.annotation.PathVariable;


import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.servlet.ModelAndView;

import com.ufc.br.model.Acessor;
import com.ufc.br.model.Pesquisador;
import com.ufc.br.model.Projeto;
import com.ufc.br.service.AcessorService;
import com.ufc.br.service.PesquisadorService;
import com.ufc.br.service.ProjetoService;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	private AcessorService acessorService;
	
	@Autowired
	private PesquisadorService pesquisadorService;
	
	@Autowired
	private ProjetoService projetoService;
	

	@RequestMapping("/inicial")
	public String Inicial() {
		return "Inicial";
	}	
	
//Projeto -------------------------------------	
	@RequestMapping("/formularioProjeto")
	public ModelAndView formularioProjeto() {
		ModelAndView mv = new ModelAndView("FormularioProjeto");
		mv.addObject("projeto", new Projeto());
		return mv;
	}


	
	
	@RequestMapping("/salvarProjeto")
	public ModelAndView salvarProjeto(@Validated Projeto projeto, BindingResult result) {
		
		ModelAndView mv = new ModelAndView("FormularioProjeto");
		
		if(result.hasErrors()) {	
			return mv;
		}
		
		projetoService.cadastrarProjeto(projeto);
		
		mv.addObject("mensagem", "Projeto cadastrado com sucesso");
		return mv;
	}
	
	@RequestMapping("/avaliarProjeto")
	public ModelAndView avaliarProjeto(Projeto projeto) {
		projetoService.cadastrarProjeto(projeto);
		ModelAndView mv = new ModelAndView("redirect:/pessoa/paginaAcessor");
		return mv;
	}
//Pesquisador ------------------------------------	
	
	@RequestMapping("/loginPesquisador")
	public String loginPesquisador() {
		return "LoginPesquisador";
	}
	
	
	
	@RequestMapping("/paginaPesquisador")
	public ModelAndView paginaPesquisador() {
		List<Projeto> projeto = projetoService.listarProjeto();
		ModelAndView mv = new ModelAndView ("PaginaPesquisador");
		mv.addObject("listaProjetos", projeto);
		return mv;
	}
	
	@RequestMapping("/formularioPesquisador")
	public ModelAndView formularioPesquisador() {
		ModelAndView mv = new ModelAndView("FormularioPesquisador");
		mv.addObject("pesquisador", new Pesquisador());
		return mv;
	}

	
	@RequestMapping("/salvarPesquisador")
	public ModelAndView salvarPesquisador(@Validated Pesquisador pesquisador, BindingResult result) {
		
		ModelAndView mv = new ModelAndView("FormularioPesquisador");
		
		if(result.hasErrors()) {	
			return mv;
		}
		pesquisadorService.cadastrarPesquisador(pesquisador);
		mv.addObject("mensagem", "Pesquisador cadastrado com sucesso");
	 return mv;
	}
		
//Acessor ------- ----------------------------------
	
	@RequestMapping("/loginAcessor")
	public String loginAcessor() {
		return "LoginAcessor";
	}
	
	/*
	@RequestMapping("/logarAcessor/{senhaA}")
	public ModelAndView logarAcessor(@PathVariable String senhaA) {
		List<Acessor> acessor = acessorService.listarAcessor();
		
		for(Acessor a : acessor) {
			if(a.getSenhaA()== senhaA);
			ModelAndView mv = new ModelAndView("redirect:/pessoa/paginaAcessor");
			return mv;
		}
		ModelAndView mv = new ModelAndView("redirect:/pessoa/logarAcessor");
		return mv;
		
	}
	*/
	@RequestMapping("/paginaAcessor")
	public ModelAndView paginaAcessor() {
		List<Projeto> projeto = projetoService.listarProjeto();
		ModelAndView mv = new ModelAndView ("PaginaAcessor");
		mv.addObject("listaProjetos", projeto);
		return mv;
	}
	
	@RequestMapping("/avaliar/{codigoProjeto}")
	public ModelAndView avaliarProjeto(@PathVariable Long codigoProjeto) {
		Projeto projeto = projetoService.buscarID(codigoProjeto);
		ModelAndView mv = new ModelAndView ("Avaliacao");
		mv.addObject("projeto", projeto);
		return mv;
	}
	
	
	@RequestMapping("/formularioAcessor")
	public ModelAndView formularioAcessor() {
		ModelAndView mv = new ModelAndView("FormularioAcessor");
		mv.addObject("acessor", new Acessor());
		return mv;
	}
	

	@RequestMapping("/salvarAcessor")
	public ModelAndView salvarAcessor(@Validated Acessor acessor, BindingResult result) {
		

		ModelAndView mv = new ModelAndView("FormularioAcessor");
		
		if(result.hasErrors()) {	
			return mv;
		}
		
		acessorService.cadastrarAcessor(acessor);
		mv.addObject("mensagem", "Acessor cadastrado com sucesso");
		return mv;
	}
	
	
	
	
	
//Manutenção --------------------------------	

	
	@RequestMapping("/olaPro")
	public ModelAndView excluirAcessor() {
	List<Projeto> projeto = projetoService.listarProjeto();
	ModelAndView mv = new ModelAndView ("OlaMundo");
	mv.addObject("listaProjetos", projeto);
	return mv;
	}

	@RequestMapping("/excluirPro/{codigoProjeto}")
	public ModelAndView excluirProjeto(@PathVariable Long codigoProjeto) {
		projetoService.excluirProjeto(codigoProjeto);
		ModelAndView mv = new ModelAndView ("redirect:/pessoa/olaPro");
		return mv;
	}

}
