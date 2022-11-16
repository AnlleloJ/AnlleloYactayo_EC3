package EC3AnlleloYactayo.Service;

import java.util.List;

import EC3AnlleloYactayo.Dto.HospitalDTORequest;
import EC3AnlleloYactayo.Dto.HospitalDTOResponse;



public interface HospitalService {
	
	void guardarHospital(HospitalDTORequest hospital);
	void actualizarHospital(HospitalDTORequest hospital);
	void eliminarHospital(Integer id);
	List<HospitalDTOResponse> listarHospital();
	HospitalDTOResponse obtenerHospitalId(Integer id);

}
