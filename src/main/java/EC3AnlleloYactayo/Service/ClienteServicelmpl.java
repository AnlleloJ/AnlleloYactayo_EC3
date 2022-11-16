package EC3AnlleloYactayo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EC3AnlleloYactayo.Model.Cliente;
import EC3AnlleloYactayo.Repository.ClienteRepository;


@Service
public class ClienteServicelmpl implements ClienteService {
	
	@Autowired
	private ClienteRepository repository;

	@Override
	public void guardarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		repository.save(cliente);

	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(cliente);

	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public List<Cliente> listarCliente() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Cliente obtenerClienteId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
