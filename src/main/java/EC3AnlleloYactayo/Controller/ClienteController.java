package EC3AnlleloYactayo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import EC3AnlleloYactayo.Model.Cliente;
import EC3AnlleloYactayo.Service.ClienteService;

@Controller
@RequestMapping(path = "/cliente/vl")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<Cliente>> listar(){
		return new ResponseEntity<List<Cliente>>(service.listarCliente(), HttpStatus.OK);
	}

}
