package EC3AnlleloYactayo.Service;

import java.util.List;

import EC3AnlleloYactayo.Model.UsuarioCliente;

public interface UsuarioClienteService {
	
	void guardarUsuarioCliente(UsuarioCliente usuario);
	void actualizarUsuarioCliente(UsuarioCliente usuario);
	void eliminarUsuarioCliente(Integer id);
	List<UsuarioCliente> listarUsuario();
	UsuarioCliente obtenerUsuarioId(Integer id);

}
