package com.example.eoi.incideitor.repositories;

import com.example.eoi.incideitor.entities.Estado;
import com.example.eoi.incideitor.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {


}