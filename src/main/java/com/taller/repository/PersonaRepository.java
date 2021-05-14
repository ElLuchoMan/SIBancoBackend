package com.taller.repository;

import javax.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import com.taller.entity.Persona;

@Entity
public interface PersonaRepository extends JpaRepository<Persona, Number>{

}
