package br.com.ajuniofc.guestlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ajuniofc.guestlist.model.Guest;
import br.com.ajuniofc.guestlist.repository.GuestRepository;

@Controller
public class GuestController {
	
	@Autowired
	private GuestRepository repository;
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("list")
	public String list(Model model){
		
		Iterable<Guest> guests = repository.findAll();
		model.addAttribute("guests", guests);
		return "list";
	}
}
