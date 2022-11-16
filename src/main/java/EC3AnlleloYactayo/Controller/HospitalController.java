package EC3AnlleloYactayo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import EC3AnlleloYactayo.Dto.HospitalDTOResponse;
import EC3AnlleloYactayo.Service.HospitalService;


@Controller
@RequestMapping(path = "/hospital/vl")
public class HospitalController {
	
	@Autowired
	private HospitalService service;
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<HospitalDTOResponse>> listar(){
		return new ResponseEntity<List<HospitalDTOResponse>>(service.listarHospital(), HttpStatus.OK);
	}

}
