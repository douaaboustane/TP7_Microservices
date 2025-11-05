package ma.ws.JAX_RS.repositories;

import ma.ws.JAX_RS.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
    }

