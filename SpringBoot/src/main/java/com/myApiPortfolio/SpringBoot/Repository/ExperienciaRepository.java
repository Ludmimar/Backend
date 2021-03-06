

package com.myApiPortfolio.SpringBoot.Repository;

import com.myApiPortfolio.SpringBoot.Model.Experiencia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long > {
    public List<Experiencia> findByIdPersona(Long idPersona); //Agrego este metodo
}
