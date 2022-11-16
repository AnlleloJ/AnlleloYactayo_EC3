package EC3AnlleloYactayo.Service;

import java.util.List;

import EC3AnlleloYactayo.Model.Cliente;

public interface ClienteService {
	
	void guardarCliente(Cliente cliente);
	void actualizarCliente(Cliente cliente);
	void eliminarCliente(Integer id);
	List<Cliente> listarCliente();
	Cliente obtenerClienteId(Integer id);

}
