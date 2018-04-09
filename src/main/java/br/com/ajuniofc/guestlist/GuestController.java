package br.com.ajuniofc.guestlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping(value= "save", method = RequestMethod.POST)
	public String save(@RequestParam("name") String name, @RequestParam("email") String email,
	                   @RequestParam("telephone") String telephone, Model model ){

	    Guest guest = new Guest(name, email, telephone);
	    repository.save(guest);

	    Iterable<Guest> guests = repository.findAll();
	    model.addAttribute("guests", guests);

	    return "list";
	}
}
