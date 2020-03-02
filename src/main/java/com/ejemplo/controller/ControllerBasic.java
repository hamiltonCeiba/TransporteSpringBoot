package com.ejemplo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.ejemplo.configuracion.Pagina;
import com.ejemplo.model.Transporte;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/services")
public class ControllerBasic {

	public List<Transporte> listTransporte() {
		List<Transporte> listTransport = new ArrayList<>();
		listTransport.add(new Transporte(1, "Buses integrados", "Transporte terrestre sobre carretera",
				"http://localhost/img/alimentadores.png"));
		listTransport.add(new Transporte(2, "Metro", "Transporte terrestre sobre vías ferreas",
				"http://localhost/img/alimentadores.png"));
		return listTransport;
	}

	/*@GetMapping(path = { "/" })
	public String saludar(Model model) {
		model.addAttribute("transporte", this.listTransporte());
		return Pagina.HOME;
	}*/

	@GetMapping(path = { "/inicio" })
	public ModelAndView transporte() {
		ModelAndView model = new ModelAndView(Pagina.HOME);
		model.addObject("transporte", this.listTransporte());
		return model;
	}

	@GetMapping(path = {"/transport"})
	public ModelAndView getIndividualTransport(
			@RequestParam(defaultValue = "1", name = "idTransport", required = false) int idTransport) {
		System.out.println(idTransport);
		ModelAndView model = new ModelAndView(Pagina.TRANSPORT_SELECTED);
		List<Transporte> transportSelect = this.listTransporte()
				.stream()
				.filter(trans -> trans.getId() == idTransport)
				.collect(Collectors.toList());
		model.addObject("transporte", transportSelect.get(0));
		return model;
	}
}
