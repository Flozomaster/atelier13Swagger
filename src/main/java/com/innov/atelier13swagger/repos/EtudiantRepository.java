package com.innov.atelier13swagger.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.innov.atelier13swagger.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
	
}
