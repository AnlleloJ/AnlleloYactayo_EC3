package EC3AnlleloYactayo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC3AnlleloYactayo.Model.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer>{

}
