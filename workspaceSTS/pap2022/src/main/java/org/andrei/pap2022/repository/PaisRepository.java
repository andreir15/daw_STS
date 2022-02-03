package org.andrei.pap2022.repository;

import org.andrei.pap2022.entities.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<Pais,Long>{

}
