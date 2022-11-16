package EC3AnlleloYactayo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC3AnlleloYactayo.Model.Cliente;

@Repository 
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
