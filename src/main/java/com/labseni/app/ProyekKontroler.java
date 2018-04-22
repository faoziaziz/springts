package com.labseni.app.controller;

import java.math.BigDecimal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.labseni.app.domain.Proyek;

@Controller
public class ProyekKontroler{
	private String boker = "dicelana";
	@RequestMapping("/proyek")
	public String list(Model model){
		
		Proyek MITSpring = new Proyek("P1234", "MITSpring1s", new BigDecimal(500));
		MITSpring.setDeskripsi("Proyek ini diguanakan untuk memburu MIT di midle end");
		MITSpring.setKategori("WebApp");
		MITSpring.setManufaktur("Labseni");
		model.addAttribute("proyek", MITSpring.name);
		return "proyek";
	}

}