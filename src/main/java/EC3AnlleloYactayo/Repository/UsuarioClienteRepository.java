package EC3AnlleloYactayo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC3AnlleloYactayo.Model.UsuarioCliente;


@Repository
public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Integer>{
	
	UsuarioCliente findByUsuario(String usuario);

}
